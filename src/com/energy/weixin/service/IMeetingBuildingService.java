package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.MeetingBuilding;

public interface IMeetingBuildingService {

	public void addMeetingBuilding(MeetingBuilding meetingBuilding);

	public List<MeetingBuilding> getAllMeetingBuilding();

	public MeetingBuilding getMeetingBuildingById(String id);

	public void deleteById(String id);

	public void update(MeetingBuilding meetingBuilding);

}
