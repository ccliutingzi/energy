package com.energy.weixin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramDao;
import com.energy.weixin.entity.Program;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ProgramDaoImpl implements IProgramDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加项目信息
	 */
	private static final String ADDPROGRAM_SQL = "addProgram";
	/**
	 * 获取所有项目信息
	 */
	//private static final String GETALLPROGRAM_SQL = "getAllProgram";
	/**
	 * 根据id获取项目信息
	 */
	//private static final String GETPROGRAMBYID_SQL = "getProgramById";
	/**
	 * 根据id删除项目信息
	 */
	//private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新项目信息
	 */
	//private static final String UPDATE_SQL = "update";

	@Override
	public void addProgram(Program program) {
		baseDao.insert(ADDPROGRAM_SQL, program);
	}

}
