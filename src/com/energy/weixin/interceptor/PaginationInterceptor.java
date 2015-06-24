/**
 * 
 */
package com.energy.weixin.interceptor;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;

import com.energy.weixin.entity.PageQueryParameter;
import com.energy.weixin.utils.ReflectUtil;

/**
 * 分页拦截器
 * 
 * @author tf
 * 
 */
@Intercepts({ @Signature(method = "prepare", type = StatementHandler.class, args = { Connection.class }) })
public class PaginationInterceptor implements Interceptor {

	private static final String MYSQL_TYPE = "mysql";
	private static final String ORACLE_TYPE = "oracle";
	/**
	 * 数据库类型，不同的数据库有不同的分页方法
	 */
	private String databaseType;

	/**
	 * 拦截后要执行的方法
	 */
	public Object intercept(Invocation invocation) throws Throwable {
		RoutingStatementHandler handler = (RoutingStatementHandler) invocation
				.getTarget();
		BoundSql boundSql = handler.getBoundSql();
		// 拿到当前绑定Sql的参数对象，就是我们在调用对应的Mapper映射语句时所传入的参数对象
		Object obj = handler.getParameterHandler().getParameterObject();
		// 这里我们简单的通过传入的是Page对象就认定它是需要进行分页操作的。
		if (obj instanceof PageQueryParameter) {
			PageQueryParameter page = (PageQueryParameter) obj;
			// 拦截到的prepare方法参数是一个Connection对象
			// 获取当前要执行的Sql语句，也就是我们直接在Mapper映射语句中写的Sql语句
			String sql = boundSql.getSql();
			// 获取分页Sql语句
			String pageSql = this.getPageSql(page, sql);
			// 利用反射设置当前BoundSql对应的sql属性为我们建立好的分页Sql语句
			ReflectUtil.setFieldValue(boundSql, "sql", pageSql);
		}
		return invocation.proceed();
	}

	/**
	 * 拦截器对应的封装原始对象的方法
	 */
	public Object plugin(Object target) {
		return Plugin.wrap(target, this);
	}

	/**
	 * 设置注册拦截器时设定的属性
	 */
	public void setProperties(Properties properties) {
		this.databaseType = properties.getProperty("databaseType");
	}

	/**
	 * 根据page对象获取对应的分页查询Sql语句，这里只做了两种数据库类型，Mysql和Oracle 其它的数据库都 没有进行分页
	 * 
	 * @param page
	 *            分页对象
	 * @param sql
	 *            原sql语句
	 * @return
	 */
	private String getPageSql(PageQueryParameter page, String sql) {
		StringBuffer sqlBuffer = new StringBuffer(sql);
		if (MYSQL_TYPE.equalsIgnoreCase(databaseType)) {
			return getMysqlPageSql(page, sqlBuffer);
		} else if (ORACLE_TYPE.equalsIgnoreCase(databaseType)) {
			return getOraclePageSql(page, sqlBuffer);
		}
		return sqlBuffer.toString();
	}

	/**
	 * 获取Mysql数据库的分页查询语句
	 * 
	 * @param page
	 *            分页对象
	 * @param sqlBuffer
	 *            包含原sql语句的StringBuffer对象
	 * @return Mysql数据库分页语句
	 */
	private String getMysqlPageSql(PageQueryParameter page,
			StringBuffer sqlBuffer) {
		// 计算第一条记录的位置，Mysql中记录的位置是从0开始的。
		int offset = (page.getPageIndex() - 1) * page.getPageSize();
		sqlBuffer.append(" limit ").append(offset).append(",")
				.append(page.getPageSize());
		return sqlBuffer.toString();
	}

	/**
	 * 获取Oracle数据库的分页查询语句
	 * 
	 * @param page
	 *            分页对象
	 * @param sqlBuffer
	 *            包含原sql语句的StringBuffer对象
	 * @return Oracle数据库的分页查询语句
	 */
	private String getOraclePageSql(PageQueryParameter page,
			StringBuffer sqlBuffer) {
		// 计算第一条记录的位置，Oracle分页是通过rownum进行的，而rownum是从1开始的
		int offset = (page.getPageIndex() - 1) * page.getPageSize() + 1;
		sqlBuffer.insert(0, "select u.*, rownum r from (")
				.append(") u where rownum < ")
				.append(offset + page.getPageSize());
		sqlBuffer.insert(0, "select * from (").append(") where r >= ")
				.append(offset);
		return sqlBuffer.toString();
	}
}
