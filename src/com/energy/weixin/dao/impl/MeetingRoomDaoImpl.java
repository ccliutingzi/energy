package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IMeetingRoomDao;
import com.energy.weixin.entity.MeetingRoom;

/**
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class MeetingRoomDaoImpl implements IMeetingRoomDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加会议室信息
	 */
	private static final String ADDMEETINGROOM_SQL = "addMeetingRoom";
	/**
	 * 获取所有会议室信息
	 */
	private static final String GETALLMEETINGROOM_SQL = "getAllMeetingRoom";
	/**
	 * 根据id获取会议室信息
	 */
	private static final String GETMEETINGROOMBYID_SQL = "getMeetingRoomById";
	/**
	 * 根据id删除会议室信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新会议室信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addMeetingRoom(MeetingRoom meetingRoom) {
		baseDao.insert(ADDMEETINGROOM_SQL, meetingRoom);
	}

	@Override
	public List<MeetingRoom> getAllMeetingRoom() {
		return baseDao.selectList(GETALLMEETINGROOM_SQL);
	}

	@Override
	public MeetingRoom getMeetingRoomById(String id) {
		return baseDao.selectOne(GETMEETINGROOMBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(MeetingRoom meetingRoom) {
		baseDao.update(UPDATE_SQL, meetingRoom);
	}

}
