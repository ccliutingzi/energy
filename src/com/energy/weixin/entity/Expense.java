package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: Expense 
 * @Description: 报销类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Expense implements Serializable {

	private static final long serialVersionUID = 2973671643957111823L;
	
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
	 * 报销主题
	 */
	private String theme;
	/*
	 * 报销部门
	 */
	private String department;
	/*
	 * 报销事由
	 */
	private String reason;
	/*
	 * 报销总额
	 */
	private float amount;
	/*
	 * 附件数量
	 */
	private int annexCount;
	/*
	 * 发起时间
	 */
	private Date createTime;
	/*
	 * 当前状态，0-待审核，1-审核中，2-已审核，3-待报销，4-已报销
	 */
	private char status;
	
	public Expense() {
		super();
	}

	public Expense(String id, String userId, String userName, String theme,
			String department, String reason, float amount, int annexCount,
			Date createTime, char status) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.theme = theme;
		this.department = department;
		this.reason = reason;
		this.amount = amount;
		this.annexCount = annexCount;
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

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getAnnexCount() {
		return annexCount;
	}

	public void setAnnexCount(int annexCount) {
		this.annexCount = annexCount;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

}
