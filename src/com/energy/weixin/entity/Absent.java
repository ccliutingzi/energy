package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * 请假类
 */
public class Absent implements Serializable {

	private static final long serialVersionUID = 2645557369660120365L;

	/*
	 * ID
	 */
	private String id;
	/*
	 * 请假发起人用户ID
	 */
	private String userId;
	/*
	 * 请假发起人用户姓名
	 */
	private String userName;
	/*
	 * 请假事由
	 */
	private String reason;
	/*
	 * 职别
	 */
	private String position;
	/*
	 * 部门
	 */
	private String department;
	/*
	 * 请假开始时间
	 */
	private Date beginTime;
	/*
	 * 请假结束时间
	 */
	private Date endTime;
	/*
	 * 发起时间
	 */
	private Date createTime;
	/*
	 * 当前状态
	 */
	private char status;
	
	public Absent(){}
	
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

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
