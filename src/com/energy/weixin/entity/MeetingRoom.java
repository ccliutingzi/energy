package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Meeting_Room 
 * @Description: 会议室类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class MeetingRoom implements Serializable {

	private static final long serialVersionUID = -5622995574281939282L;
	
	/*
	 * ID
	 */
	private String id;
	/*
	 * 所属楼栋/楼层ID
	 */
	private String buildingId;
	/*
	 * 会议室名称
	 */
	private String roomName;
	/*
	 * 容纳人数
	 */
	private int capacity;
	/*
	 * 设备情况
	 */
	private String equipment;
	
	public MeetingRoom() {
		super();
	}

	public MeetingRoom(String id, String buildingId, String roomName,
			int capacity, String equipment) {
		super();
		this.id = id;
		this.buildingId = buildingId;
		this.roomName = roomName;
		this.capacity = capacity;
		this.equipment = equipment;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(String buildingId) {
		this.buildingId = buildingId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getEquipment() {
		return equipment;
	}

	public void setEquipment(String equipment) {
		this.equipment = equipment;
	}

}
