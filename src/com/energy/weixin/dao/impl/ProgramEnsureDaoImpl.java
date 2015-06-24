package com.energy.weixin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramEnsureDao;
import com.energy.weixin.entity.ProgramEnsure;

/**
 * 项目-合同确认DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ProgramEnsureDaoImpl implements IProgramEnsureDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加项目-合同确认信息
	 */
	private static final String ADDPROGRAMENSURE_SQL = "addProgramEnsure";

	/**
	 * 获取所有项目-合同确认信息
	 */
	// private static final String GETALLPROGRAMENSURE_SQL =
	// "getAllProgramEnsure";
	/**
	 * 根据id获取项目-合同确认信息
	 */
	// private static final String GETPROGRAMENSUREBYID_SQL =
	// "getProgramEnsureById";
	/**
	 * 根据id删除项目-合同确认信息
	 */
	// private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新项目-合同确认信息
	 */
	// private static final String UPDATE_SQL = "update";

	@Override
	public void addProgramEnsure(ProgramEnsure programEnsure) {
		baseDao.insert(ADDPROGRAMENSURE_SQL, programEnsure);
	}

}
