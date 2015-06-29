package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.ISystemStatusDao;
import com.energy.weixin.entity.SystemStatus;

/**
 * 
 * @author tf
 * 
 *         2015年6月27日 下午6:51:00
 */
@Service
public class SystemStatusDaoImpl implements ISystemStatusDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加系统状态
	 */
	private static final String ADDSYSTEMSTATUS_SQL = "addSystemStatus";

	/**
	 * 获取系统状态
	 */
	private static final String GETSYSTEMSTATUS_SQL = "getSystemStatus";

	/**
	 * 删除系统状态
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新系统状态
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addSystemStatus(SystemStatus systemStatus) {
		baseDao.insert(ADDSYSTEMSTATUS_SQL, systemStatus);
	}

	@Override
	public List<SystemStatus> getSystemStatus(SystemStatus systemStatus) {
		return baseDao.selectList(GETSYSTEMSTATUS_SQL, systemStatus);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(SystemStatus systemStatus) {
		baseDao.update(UPDATE_SQL, systemStatus);
	}

}
