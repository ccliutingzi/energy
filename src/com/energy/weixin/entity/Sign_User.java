package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: Sign_User 
 * @Description: 用户签到类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Sign_User implements Serializable {

	private static final long serialVersionUID = 3426359920089143003L;
	
	/*
	 * 签到信息ID
	 */
	private String signID;
	/*
	 * 用户ID
	 */
	private String userID;
	/*
	 * 签到人所在地点
	 */
	private String location;
	/*
	 * 签到时间
	 */
	private Date signTime;
	/*
	 * 出勤类型，QD为签到，QT为签退
	 */
	private String attendType;
	/*
	 * 备注
	 */
	private String remark;
	
	public Sign_User() {
		super();
	}

	public Sign_User(String signID, String userID, String location,
			Date signTime, String attendType, String remark) {
		super();
		this.signID = signID;
		this.userID = userID;
		this.location = location;
		this.signTime = signTime;
		this.attendType = attendType;
		this.remark = remark;
	}

	public String getSignID() {
		return signID;
	}

	public void setSignID(String signID) {
		this.signID = signID;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getSignTime() {
		return signTime;
	}

	public void setSignTime(Date signTime) {
		this.signTime = signTime;
	}

	public String getAttendType() {
		return attendType;
	}

	public void setAttendType(String attendType) {
		this.attendType = attendType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

 }
