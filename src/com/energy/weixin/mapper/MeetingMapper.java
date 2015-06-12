package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Meeting;

public interface MeetingMapper {

	public void addMeeting(Meeting meeting);

	public List<Meeting> getAllMeeting();

	public Meeting getMeetingById(String id);

	public void deleteById(String id);

	public void update(Meeting meeting);

}
