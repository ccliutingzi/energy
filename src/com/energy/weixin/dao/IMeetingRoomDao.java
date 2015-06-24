package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.MeetingRoom;

public interface IMeetingRoomDao {

	public void addMeetingRoom(MeetingRoom meetingRoom);

	public List<MeetingRoom> getAllMeetingRoom();

	public MeetingRoom getMeetingRoomById(String id);

	public void deleteById(String id);

	public void update(MeetingRoom meetingRoom);

}
