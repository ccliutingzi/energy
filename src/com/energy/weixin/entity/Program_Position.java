package com.energy.weixin.entity;

import java.io.Serializable;

import com.energy.weixin.enums.Position;
import com.energy.weixin.enums.PositionType;
import com.energy.weixin.enums.ProgramStage;

/** 
 * @ClassName: Program_Position 
 * @Description: 项目-职务/岗位安排表
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Program_Position implements Serializable {

	private static final long serialVersionUID = -5371555382288523465L;
	
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
	 * 项目所属阶段
	 */
	private ProgramStage stage;
	/*
	 * 职务/岗位，取值范围：0-设总、1-变电一次设计、2-变电二次、3-土建、4-水工、
	 * 5-暖通、6-技经、7-系统、8-通信，9-设计、10-报物资人员
	 */
	private Position position;
	/*
	 * 类型，取值范围：0-主设，1-校核
	 */
	private PositionType type;

	public Program_Position() {
		super();
	}

	public Program_Position(String id, String programId, String userId,
			String userName, ProgramStage stage, Position position,
			PositionType type) {
		super();
		this.id = id;
		this.programId = programId;
		this.userId = userId;
		this.userName = userName;
		this.stage = stage;
		this.position = position;
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

	public ProgramStage getStage() {
		return stage;
	}

	public void setStage(ProgramStage stage) {
		this.stage = stage;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public PositionType getType() {
		return type;
	}

	public void setType(PositionType type) {
		this.type = type;
	}

}
