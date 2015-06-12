package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Meeting_Room;

public interface Meeting_RoomMapper {

	public void addMeeting_Room(Meeting_Room meeting_Room);

	public List<Meeting_Room> getAllMeeting_Room();

	public Meeting_Room getMeeting_RoomById(String id);

	public void deleteById(String id);

	public void update(Meeting_Room meeting_Room);

}
