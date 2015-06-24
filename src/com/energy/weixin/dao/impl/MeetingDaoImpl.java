package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IMeetingDao;
import com.energy.weixin.entity.Meeting;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class MeetingDaoImpl implements IMeetingDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加会议信息
	 */
	private static final String ADDMEETING_SQL = "addMeeting";
	/**
	 * 获取所有会议信息
	 */
	private static final String GETALLMEETING_SQL = "getAllMeeting";
	/**
	 * 根据id获取会议信息
	 */
	private static final String GETMEETINGBYID_SQL = "getMeetingById";
	/**
	 * 根据id删除会议信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新会议信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addMeeting(Meeting meeting) {
		baseDao.insert(ADDMEETING_SQL, meeting);
	}

	@Override
	public List<Meeting> getAllMeeting() {
		return baseDao.selectList(GETALLMEETING_SQL);
	}

	@Override
	public Meeting getMeetingById(String id) {
		return baseDao.selectOne(GETMEETINGBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(Meeting meeting) {
		baseDao.update(UPDATE_SQL, meeting);
	}

}
