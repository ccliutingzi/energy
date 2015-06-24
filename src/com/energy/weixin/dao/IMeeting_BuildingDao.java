package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Meeting_Building;

public interface IMeeting_BuildingDao {

	public void addMeeting_Building(Meeting_Building meeting_Building);

	public List<Meeting_Building> getAllMeeting_Building();

	public Meeting_Building getMeeting_BuildingById(String id);

	public void deleteById(String id);

	public void update(Meeting_Building meeting_Building);

}
