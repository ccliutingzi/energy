package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName: Entity_Account
 * @Description: 实体-账户对应类
 * @author CCLIU
 * @date 2015-6-11 上午11:05:22 v1.0
 */
public class EntityAccount implements Serializable {

	private static final long serialVersionUID = -8429861658346218205L;

	/*
	 * 实体ID
	 */
	private String entityId;
	/*
	 * 实体类型，QD为签到，QJ为请假，BX为报销，SP为审批，HY为会议室预定，XM为项目管理
	 */
	private String entityType;
	/*
	 * 账户ID
	 */
	private String accountId;
	/*
	 * 账户类型，D为部门，T为标签，U为用户
	 */
	private String accountType;
	/*
	 * 类型，SH为审核，CS为抄送，CW为财务
	 */
	private String personType;
	/*
	 * 处理结果，1为已处理/同意，0为未处理/拒绝
	 */
	private String dealResult;
	/*
	 * 目标日期，用于签到
	 */
	private Date targetDate;
	/*
	 * 备注/拒绝原因
	 */
	private String remark;
	/*
	 * 更新时间
	 */
	private Date updateTime;

	public EntityAccount() {
	}

	public EntityAccount(String entityId, String entityType, String accountId, String accountType,
			String personType, String dealResult, Date targetDate, String remark) {
		super();
		this.entityId = entityId;
		this.entityType = entityType;
		this.accountId = accountId;
		this.accountType = accountType;
		this.personType = personType;
		this.dealResult = dealResult;
		this.targetDate = targetDate;
		this.remark = remark;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getEntityType() {
		return entityType;
	}

	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}

	

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPersonType() {
		return personType;
	}

	public void setPersonType(String personType) {
		this.personType = personType;
	}

	public String getDealResult() {
		return dealResult;
	}

	public void setDealResult(String dealResult) {
		this.dealResult = dealResult;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
