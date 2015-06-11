package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Entity_Account 
 * @Description: 实体-账户对应类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Entity_Account implements Serializable {

	private static final long serialVersionUID = -8429861658346218205L;
	
	/*
	 * 实体ID
	 */
	private String entityID;
	/*
	 * 实体类型，QD为签到，QJ为请假，BX为报销，SP为审批，HY为会议室预定，XM为项目管理
	 */
	private String entityType;
	/*
	 * 账户ID 
	 */
	private String accountID;
	/*
	 * 账户类型，D为部门，T为标签，U为用户
	 */
	private String accoutType;
	/*
	 * 类型，SH为审核，CS为抄送，CW为财务
	 */
	private String personType;
	/*
	 * 处理结果，1为已处理/同意，0为未处理/拒绝
	 */
	private String dealResult;
	/*
	 * 备注/拒绝原因
	 */
	private String remark;
	
	public Entity_Account() {
	}
	
	public Entity_Account(String entityID, String entityType, String accountID,
			String accoutType, String personType, String dealResult,
			String remark) {
		super();
		this.entityID = entityID;
		this.entityType = entityType;
		this.accountID = accountID;
		this.accoutType = accoutType;
		this.personType = personType;
		this.dealResult = dealResult;
		this.remark = remark;
	}

	public String getEntityID() {
		return entityID;
	}
	public void setEntityID(String entityID) {
		this.entityID = entityID;
	}
	public String getEntityType() {
		return entityType;
	}
	public void setEntityType(String entityType) {
		this.entityType = entityType;
	}
	public String getAccountID() {
		return accountID;
	}
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	public String getAccoutType() {
		return accoutType;
	}
	public void setAccoutType(String accoutType) {
		this.accoutType = accoutType;
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
