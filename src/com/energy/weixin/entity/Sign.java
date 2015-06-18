package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

import com.energy.weixin.enums.SignType;

/** 
 * @ClassName: Sign 
 * @Description: 签到类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Sign implements Serializable {

	private static final long serialVersionUID = -4287583522483818554L;
	
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
	 * 签到主题
	 */
	private String theme;
	/*
	 * 签到开始时间
	 */
	private Date beginTime;
	/*
	 * 签到结束时间
	 */
	private Date endTime;
	/*
	 * 签到类型，KQ为考勤签到，QT为其他签到
	 */
	private SignType signType;
	
	public Sign() {
		super();
	}

	public Sign(String id, String userId, String userName, String theme,
			Date beginTime, Date endTime, SignType signType) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.theme = theme;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.signType = signType;
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

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
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

	public SignType getSignType() {
		return signType;
	}

	public void setSignType(SignType signType) {
		this.signType = signType;
	}
	
}
