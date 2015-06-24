package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.MeetingBuilding;

public interface IMeetingBuildingDao {

	public void addMeeting_Building(MeetingBuilding meetingBuilding);

	public List<MeetingBuilding> getAllMeetingBuilding();

	public MeetingBuilding getMeetingBuildingById(String id);

	public void deleteById(String id);

	public void update(MeetingBuilding meetingBuilding);

}
