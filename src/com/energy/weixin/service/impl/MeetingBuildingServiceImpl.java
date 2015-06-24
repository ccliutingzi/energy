/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IMeetingBuildingDao;
import com.energy.weixin.entity.MeetingBuilding;
import com.energy.weixin.service.IMeetingBuildingService;

/**
 * @author tf
 *
 * 2015年6月24日
 */
@Service("meetingBuildingService")
public class MeetingBuildingServiceImpl implements IMeetingBuildingService {

	@Autowired
	private IMeetingBuildingDao meetingBuildingDao;
	@Override
	public void addMeetingBuilding(MeetingBuilding meetingBuilding) {
		meetingBuildingDao.addMeetingBuilding(meetingBuilding);		
	}

	@Override
	public List<MeetingBuilding> getAllMeetingBuilding() {
		return meetingBuildingDao.getAllMeetingBuilding();
	}

	@Override
	public MeetingBuilding getMeetingBuildingById(String id) {
		return meetingBuildingDao.getMeetingBuildingById(id);
	}

	@Override
	public void deleteById(String id) {
		meetingBuildingDao.deleteById(id);
		
	}

	@Override
	public void update(MeetingBuilding meetingBuilding) {
		meetingBuildingDao.update(meetingBuilding);
	}


}
