package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Program_Feed 
 * @Description: 项目-负责人对应表
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Program_Feed implements Serializable {
 
	private static final long serialVersionUID = 500178381774597572L;
	
	/*
	 * ID 
	 */
	private String id;
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
	/*
	 * 反馈内容
	 */
	private String content;

	public Program_Feed() {
		super();
	}

	public Program_Feed(String id, String programId, String userId,
			String userName, String content) {
		super();
		this.id = id;
		this.programId = programId;
		this.userId = userId;
		this.userName = userName;
		this.content = content;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
