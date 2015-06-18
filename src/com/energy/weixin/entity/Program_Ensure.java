package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Program_Ensure 
 * @Description: 项目-合同确认信息对应表
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Program_Ensure implements Serializable {

	private static final long serialVersionUID = 4846087173859245017L;
	
	/*
	 * 项目ID 
	 */
	private String programId;
	/*
	 * 用户ID
	 */
	private String userId;
	/*
	 * 用户姓名
	 */
	private String userName;

	public Program_Ensure() {
		super();
	}

	public Program_Ensure(String programId, String userId, String userName) {
		super();
		this.programId = programId;
		this.userId = userId;
		this.userName = userName;
	}

	public String getProgramId() {
		return programId;
	}

	public void setProgramId(String programId) {
		this.programId = programId;
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

}
