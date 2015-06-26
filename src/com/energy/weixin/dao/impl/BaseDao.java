/**
 * 
 */
package com.energy.weixin.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@SuppressWarnings({ "unchecked" })
@Repository
public class BaseDao extends SqlSessionDaoSupport {

	/**
	 * 解决mybatis-spring从1.1升级到1.2所带来的dao层级的编写问题
	 */
	@Override
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}

	public <T> List<T> selectList(String sqlid, Object paramObj) {
		return (List<T>) this.getSqlSession().selectList(sqlid, paramObj);
	}

	public <T> List<T> selectList(String sqlid) {
		return (List<T>) this.getSqlSession().selectList(sqlid);
	}

	public <T> T selectOne(String sqlid) {
		return (T) this.getSqlSession().selectOne(sqlid);
	}

	public <T> T selectOne(String sqlid, Object paramObj) {
		return (T) this.getSqlSession().selectOne(sqlid, paramObj);
	}

	public int delete(String sqlid, Object paramObj) {
		return this.getSqlSession().delete(sqlid, paramObj);
	}

	public int insert(String sqlid, Object paramObj) {
		return this.getSqlSession().insert(sqlid, paramObj);
	}

	public int update(String sqlid, Object paramObj) {
		return this.getSqlSession().update(sqlid, paramObj);
	}
}
