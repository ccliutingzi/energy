package com.energy.weixin.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IProgramFeedDao;
import com.energy.weixin.entity.ProgramFeed;

/**
 * 项目-反馈DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ProgramFeedDaoImpl implements IProgramFeedDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加项目-反馈信息
	 */
	private static final String ADDPROGRAMFEED_SQL = "addProgramFeed";
	/**
	 * 获取所有项目-反馈信息
	 */
//	private static final String GETALLPROGRAMFEED_SQL = "getAllProgramFeed";
	/**
	 * 根据id获取项目-反馈信息
	 */
//	private static final String GETPROGRAMFEEDBYID_SQL = "getProgramFeedById";
	/**
	 * 根据id删除项目-反馈信息
	 */
//	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新项目-反馈信息
	 */
//	private static final String UPDATE_SQL = "update";

	@Override
	public void addProgramFeed(ProgramFeed programFeed) {
		baseDao.insert(ADDPROGRAMFEED_SQL, programFeed);
	}

}
