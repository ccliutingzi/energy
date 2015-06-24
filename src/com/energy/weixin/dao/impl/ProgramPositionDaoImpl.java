package com.energy.weixin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramPositionDao;
import com.energy.weixin.entity.ProgramPosition;

/**
 * 项目-职位/岗位安排
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ProgramPositionDaoImpl implements IProgramPositionDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加项目-职位/岗位安排信息
	 */
	private static final String ADDPROGRAMPOSITION_SQL = "addProgramPosition";
	/**
	 * 获取所有项目-职位/岗位安排信息
	 */
//	private static final String GETALLPROGRAMPOSITION_SQL = "getAllProgramPosition";
	/**
	 * 根据id获取项目-职位/岗位安排信息
	 */
//	private static final String GETPROGRAMPOSITIONBYID_SQL = "getProgramPositionById";
	/**
	 * 根据id删除项目-职位/岗位安排信息
	 */
//	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新项目-职位/岗位安排信息
	 */
//	private static final String UPDATE_SQL = "update";

	@Override
	public void addProgramPosition(ProgramPosition programPosition) {
		baseDao.insert(ADDPROGRAMPOSITION_SQL, programPosition);
	}

}
