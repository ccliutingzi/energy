package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

import com.energy.weixin.enums.AbsentType;
import com.energy.weixin.enums.Status;
import com.energy.weixin.utils.CommonUtil;

/** 
 * @ClassName: Absent 
 * @Description: 请假类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
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
	 * 请假类型，取值范围：0-事假、1-病假、2-丧假、3-产假、4-特殊休假、5-其他
	 */
	private AbsentType absentType;
	/*
	 * 请假说明
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
	 * 当前状态，1-待审核，2-审核中，3-已审核
	 */
	private Status status;
	
	public Absent(){
		this.id = CommonUtil.GeneGUID();
	}
	
	public Absent(String id, String userId, String userName, AbsentType absentType, String reason,
			String position, String department, Date beginTime, Date endTime,
			Date createTime, Status status) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.absentType = absentType;
		this.reason = reason;
		this.position = position;
		this.department = department;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.createTime = createTime;
		this.status = status;
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

	public AbsentType getAbsentType() {
		return absentType;
	}

	public void setAbsentType(AbsentType absentType) {
		this.absentType = absentType;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
