package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: Approval 
 * @Description: 审批类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Approval implements Serializable {
 
	private static final long serialVersionUID = 7190048898559281652L;
	
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
	 * 流程名称
	 */
	private String flowName;
	/*
	 * 归属部门
	 */
	private String department;
	/*
	 * 审批内容
	 */
	private String content;
	/*
	 * 备注
	 */
	private String remark;
	/*
	 * 合同编号
	 */
	private String contractNumber;
	/*
	 * 合作方
	 */
	private String partner;
	/*
	 * 发起时间
	 */
	private Date createTime;
	/*
	 * 流程类型，PT为普通类型，HT为合同类型
	 */
	private char flowType;
	/*
	 * 当前状态，0-待审核，1-审核中，2-已审核
	 */
	private char status;
	
	public Approval() {
	}
	
	public Approval(String id, String userId, String userName, String flowName,
			String department, String content, String remark,
			String contractNumber, String partner, Date createTime,
			char flowType, char status) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.flowName = flowName;
		this.department = department;
		this.content = content;
		this.remark = remark;
		this.contractNumber = contractNumber;
		this.partner = partner;
		this.createTime = createTime;
		this.flowType = flowType;
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
	public String getFlowName() {
		return flowName;
	}
	public void setFlowName(String flowName) {
		this.flowName = flowName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getContractNumber() {
		return contractNumber;
	}
	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}
	public String getPartner() {
		return partner;
	}
	public void setPartner(String partner) {
		this.partner = partner;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public char getFlowType() {
		return flowType;
	}
	public void setFlowType(char flowType) {
		this.flowType = flowType;
	}
	public char getStatus() {
		return status;
	}
	public void setStatus(char status) {
		this.status = status;
	}

}
