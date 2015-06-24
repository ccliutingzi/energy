package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IMeetingBuildingDao;
import com.energy.weixin.entity.MeetingBuilding;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class MeetingBuildingDaoImpl implements IMeetingBuildingDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加会议室楼层信息
	 */
	private static final String ADDMEETINGBUILDING_SQL = "addMeetingBuilding";
	/**
	 * 获取所有会议室楼层信息
	 */
	private static final String GETALLMEETINGBUILDING_SQL = "getAllMeetingBuilding";
	/**
	 * 根据id获取会议室楼层信息
	 */
	private static final String GETMEETINGBUILDINGBYID_SQL = "getMeetingBuildingById";
	/**
	 * 根据id删除会议室楼层信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新会议室楼层信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addMeetingBuilding(MeetingBuilding meetingBuilding) {
		baseDao.insert(ADDMEETINGBUILDING_SQL, meetingBuilding);
	}

	@Override
	public List<MeetingBuilding> getAllMeetingBuilding() {
		return baseDao.selectList(GETALLMEETINGBUILDING_SQL);
	}

	@Override
	public MeetingBuilding getMeetingBuildingById(String id) {
		return baseDao.selectOne(GETMEETINGBUILDINGBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(MeetingBuilding meetingBuilding) {
		baseDao.update(UPDATE_SQL, meetingBuilding);
	}

}
