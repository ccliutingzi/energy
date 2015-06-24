package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: Program_Payment 
 * @Description: 项目-回款信息表
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class ProgramPayment implements Serializable {

	private static final long serialVersionUID = -7071782735160628857L;
	
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
	 * 回款金额，单位元
	 */
	private float amount;
	/*
	 * 开票日期
	 */
	private Date invoiceDate;
	/*
	 * 备注
	 */
	private String remark;

	public ProgramPayment() {
		super();
	}

	public ProgramPayment(String id, String programId, String userId,
			String userName, float amount, Date invoiceDate, String remark) {
		super();
		this.id = id;
		this.programId = programId;
		this.userId = userId;
		this.userName = userName;
		this.amount = amount;
		this.invoiceDate = invoiceDate;
		this.remark = remark;
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

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}
