/**
 * 
 */
package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IAbsentDao;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.model.PageQueryParameter;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class AbsentDaoImpl implements IAbsentDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加请假信息
	 */
	private static final String ADDABSENT_SQL = "addAbsent";
	/**
	 * 获取所有请假信息
	 */
	private static final String GETALLABSENT_SQL = "getAllAbsent";
	/**
	 * 根据id获取请假信息
	 */
	private static final String GETABSENTBYID_SQL = "getAbsentById";
	/**
	 * 根据id删除请假信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新请假信息
	 */
	private static final String UPDATE_SQL = "update";
	/**
	 * 分页查询
	 */
	private static final String QUERYABSENTBYPAGE_SQL = "queryAbsentByPage";
	/**
	 * 查询记录数
	 */
	private static final String QUERYABSENTCOUNT_SQL = "queryAbsentCount";

	@Override
	public void addAbsent(Absent absent) {
		baseDao.insert(ADDABSENT_SQL, absent);
	}

	@Override
	public List<Absent> getAllAbsent() {
		return baseDao.selectList(GETALLABSENT_SQL);
	}

	@Override
	public Absent getAbsentById(String id) {
		return baseDao.selectOne(GETABSENTBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);

	}

	@Override
	public void update(Absent absent) {
		baseDao.update(UPDATE_SQL, absent);

	}

	@Override
	public long queryCount(PageQueryParameter pageQueryParameter) {
		return baseDao.selectOne(QUERYABSENTCOUNT_SQL, pageQueryParameter);
	}

	@Override
	public List<Absent> queryAbsent(PageQueryParameter pageQueryParameter) {
		return baseDao.selectList(QUERYABSENTBYPAGE_SQL, pageQueryParameter);
	}
}
