package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.MeetingRoom;

public interface IMeetingRoomService {

	public void addMeeting_Room(MeetingRoom meetingRoom);

	public List<MeetingRoom> getAllMeeting_Room();

	public MeetingRoom getMeetingRoomById(String id);

	public void deleteById(String id);

	public void update(MeetingRoom meetingRoom);

}
