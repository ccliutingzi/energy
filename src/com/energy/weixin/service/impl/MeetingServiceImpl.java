/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IMeetingDao;
import com.energy.weixin.entity.Meeting;
import com.energy.weixin.service.IMeetingService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("meetingService")
public class MeetingServiceImpl implements IMeetingService {

	@Autowired
	private IMeetingDao meetingDao;

	@Override
	public void addMeeting(Meeting meeting) {
		meetingDao.addMeeting(meeting);
	}

	@Override
	public List<Meeting> getAllMeeting() {
		return meetingDao.getAllMeeting();
	}

	@Override
	public Meeting getMeetingById(String id) {
		return meetingDao.getMeetingById(id);
	}

	@Override
	public void deleteById(String id) {
		meetingDao.deleteById(id);
	}

	@Override
	public void update(Meeting meeting) {
		meetingDao.update(meeting);
	}

}
