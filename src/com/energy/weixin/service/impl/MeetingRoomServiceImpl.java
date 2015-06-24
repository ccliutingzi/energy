/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IMeetingRoomDao;
import com.energy.weixin.entity.MeetingRoom;
import com.energy.weixin.service.IMeetingRoomService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("meetingRoomService")
public class MeetingRoomServiceImpl implements IMeetingRoomService {

	@Autowired
	private IMeetingRoomDao meetingRoomDao;

	@Override
	public void addMeetingRoom(MeetingRoom meetingRoom) {
		meetingRoomDao.addMeetingRoom(meetingRoom);

	}

	@Override
	public List<MeetingRoom> getAllMeetingRoom() {
		return meetingRoomDao.getAllMeetingRoom();
	}

	@Override
	public MeetingRoom getMeetingRoomById(String id) {
		return meetingRoomDao.getMeetingRoomById(id);
	}

	@Override
	public void deleteById(String id) {
		meetingRoomDao.deleteById(id);
	}

	@Override
	public void update(MeetingRoom meetingRoom) {
		meetingRoomDao.update(meetingRoom);
	}

}
