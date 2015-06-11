package com.energy.weixin.entity;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/** 
 * @ClassName: Meeting 
 * @Description: 会议类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Meeting implements Serializable {

	private static final long serialVersionUID = 3159777386055331379L;
	
	/*
	 * ID
	 */
	private String id;
	/*
	 * 发起人用户ID
	 */
	private String userId;
	/*
	 * 发起人用户姓名
	 */
	private String userName;
	/*
	 * 楼栋/楼层ID
	 */
	private String buildingId;
	/*
	 * 会议室ID
	 */
	private String roomId;
	/*
	 * 预定日期
	 */
	private Date date;
	/*
	 * 会议开始时间
	 */
	private Time time;
	/*
	 * 会议时长
	 */
	private int timeSpan;
	/*
	 * 会议主题
	 */
	private char theme;
	
	public Meeting() {
		super();
	}

	public Meeting(String id, String userId, String userName,
			String buildingId, String roomId, Date date, Time time,
			int timeSpan, char theme) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.buildingId = buildingId;
		this.roomId = roomId;
		this.date = date;
		this.time = time;
		this.timeSpan = timeSpan;
		this.theme = theme;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public int getTimeSpan() {
		return timeSpan;
	}

	public void setTimeSpan(int timeSpan) {
		this.timeSpan = timeSpan;
	}

	public char getTheme() {
		return theme;
	}

	public void setTheme(char theme) {
		this.theme = theme;
	}
	
}
