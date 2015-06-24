package com.energy.weixin.entity;

import java.io.Serializable;

import com.energy.weixin.enums.ChiefType;

/** 
 * @ClassName: Program_Chief 
 * @Description: 项目-负责人对应表
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class ProgramChief implements Serializable {
 
	private static final long serialVersionUID = 3584587988947231079L;
	
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
	 * 类型，取值范围为：0-纵队负责人，1-项目部负责人，2-营销负责人，3-营销支出负责人，4-设计负责人，5-运营经理
	 */
	private ChiefType type;

	public ProgramChief() {
		super();
	}

	public ProgramChief(String id, String programId, String userId,
			String userName, ChiefType type) {
		super();
		this.id = id;
		this.programId = programId;
		this.userId = userId;
		this.userName = userName;
		this.type = type;
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

	public ChiefType getType() {
		return type;
	}

	public void setType(ChiefType type) {
		this.type = type;
	}

}
