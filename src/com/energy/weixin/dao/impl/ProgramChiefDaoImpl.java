package com.energy.weixin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramChiefDao;
import com.energy.weixin.entity.ProgramChief;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ProgramChiefDaoImpl implements IProgramChiefDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加项目-负责人信息
	 */
	private static final String ADDPROGRAMCHIEF_SQL = "addProgramChief";
	/**
	 * 获取所有项目-负责人信息
	 */
	//private static final String GETALLPROGRAMCHIEF_SQL = "getAllProgramChief";
	/**
	 * 根据id获取项目-负责人信息
	 */
	//private static final String GETPROGRAMCHIEFBYID_SQL = "getProgramChiefById";
	/**
	 * 根据id删除项目-负责人信息
	 */
	//private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新项目-负责人信息
	 */
	//private static final String UPDATE_SQL = "update";

	@Override
	public void addProgramChief(ProgramChief programChief) {
		baseDao.insert(ADDPROGRAMCHIEF_SQL, programChief);
	}

}
