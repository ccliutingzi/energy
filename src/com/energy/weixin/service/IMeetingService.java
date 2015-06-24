package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.Meeting;

public interface IMeetingService {

	public void addMeeting(Meeting meeting);

	public List<Meeting> getAllMeeting();

	public Meeting getMeetingById(String id);

	public void deleteById(String id);

	public void update(Meeting meeting);

}
