package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Meeting_Room;

public interface IMeeting_RoomDao {

	public void addMeeting_Room(Meeting_Room meeting_Room);

	public List<Meeting_Room> getAllMeeting_Room();

	public Meeting_Room getMeeting_RoomById(String id);

	public void deleteById(String id);

	public void update(Meeting_Room meeting_Room);

}
