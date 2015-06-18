package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

import com.energy.weixin.enums.ConstructionType;
import com.energy.weixin.enums.ProgramNature;
import com.energy.weixin.enums.ProgramStage;
import com.energy.weixin.enums.ProgramType;
import com.energy.weixin.enums.Status;

/** 
 * @ClassName: Program 
 * @Description: 项目类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Program implements Serializable {
 
	private static final long serialVersionUID = -2123103060365888872L;
	
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
	 * 项目名称
	 */
	private String programName;
	/*
	 * 客户名称
	 */
	private String partner;
	/*
	 * 客户负责人，客户ID，从通讯录中选取，若不存在则在通讯录的“司外人员”部门下创建用户
	 */
	private String partnerPerson;
	/*
	 * 建设类型，取值范围为：XJ-新建，JG-技改，DX-大修
	 */
	private ConstructionType constructionType;
	/*
	 * 项目性质，取值范围为：XT-系统，YK-业扩
	 */
	private ProgramNature programNature;
	/*
	 * 委托书签订时间
	 */
	private Date proxySignTime;
	/*
	 * 合同签订时间
	 */
	private Date contractSignTime;
	/*
	 * 项目总投资，单位：元
	 */
	private float totalInvestment;
	/*
	 * 设计费金额，单位：元
	 */
	private float designFee;
	/*
	 * 项目规模描述
	 */
	private String programScale;
	/*
	 * 预计完成时间
	 */
	private Date expectedEndDate;
	/*
	 * 已完成阶段，取值范围：0-可研、1-初设、2-施工图、3-竣工图
	 */
	private ProgramStage CompletedStage;
	/*
	 * 现所属阶段，取值范围：0-可研、1-初设、2-施工图、3-竣工图
	 */
	private ProgramStage presentStage;
	/*
	 * 批复情况
	 */
	private String approvalMatter;
	/*
	 * 完成情况
	 */
	private String completeMatter;
	/*
	 * 图纸交付情况
	 */
	private String drawingsMatter;
	 /*
	  * 项目类别，取值范围：0-配网，1-主网
	 */
	private ProgramType programType;
	/*
	 * 备注
	 */
	private String remark;
	/*
	 * 合同是否已确认，取值范围：0-否，1-是
	 */
	private boolean isEnsured;
	/*
	 * 当前状态，取值范围：0-草稿，1-待审核，2-审核中，6-实施中，7-结束确认中，8-已结束
	 */
	private Status status;
	
	public Program() {
		super();
	}

	public Program(String id, String userId, String userName,
			String programName, String partner, String partnerPerson,
			ConstructionType constructionType, ProgramNature programNature,
			Date proxySignTime, Date contractSignTime, float totalInvestment,
			float designFee, String programScale, Date expectedEndDate,
			ProgramStage completedStage, ProgramStage presentStage,
			String approvalMatter, String completeMatter,
			String drawingsMatter, ProgramType programType, String remark,
			boolean isEnsured, Status status) {
		super();
		this.id = id;
		this.userId = userId;
		this.userName = userName;
		this.programName = programName;
		this.partner = partner;
		this.partnerPerson = partnerPerson;
		this.constructionType = constructionType;
		this.programNature = programNature;
		this.proxySignTime = proxySignTime;
		this.contractSignTime = contractSignTime;
		this.totalInvestment = totalInvestment;
		this.designFee = designFee;
		this.programScale = programScale;
		this.expectedEndDate = expectedEndDate;
		CompletedStage = completedStage;
		this.presentStage = presentStage;
		this.approvalMatter = approvalMatter;
		this.completeMatter = completeMatter;
		this.drawingsMatter = drawingsMatter;
		this.programType = programType;
		this.remark = remark;
		this.isEnsured = isEnsured;
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

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getPartner() {
		return partner;
	}

	public void setPartner(String partner) {
		this.partner = partner;
	}

	public String getPartnerPerson() {
		return partnerPerson;
	}

	public void setPartnerPerson(String partnerPerson) {
		this.partnerPerson = partnerPerson;
	}

	public ConstructionType getConstructionType() {
		return constructionType;
	}

	public void setConstructionType(ConstructionType constructionType) {
		this.constructionType = constructionType;
	}

	public ProgramNature getProgramNature() {
		return programNature;
	}

	public void setProgramNature(ProgramNature programNature) {
		this.programNature = programNature;
	}

	public Date getProxySignTime() {
		return proxySignTime;
	}

	public void setProxySignTime(Date proxySignTime) {
		this.proxySignTime = proxySignTime;
	}

	public Date getContractSignTime() {
		return contractSignTime;
	}

	public void setContractSignTime(Date contractSignTime) {
		this.contractSignTime = contractSignTime;
	}

	public float getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(float totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	public float getDesignFee() {
		return designFee;
	}

	public void setDesignFee(float designFee) {
		this.designFee = designFee;
	}

	public String getProgramScale() {
		return programScale;
	}

	public void setProgramScale(String programScale) {
		this.programScale = programScale;
	}

	public Date getExpectedEndDate() {
		return expectedEndDate;
	}

	public void setExpectedEndDate(Date expectedEndDate) {
		this.expectedEndDate = expectedEndDate;
	}

	public ProgramStage getCompletedStage() {
		return CompletedStage;
	}

	public void setCompletedStage(ProgramStage completedStage) {
		CompletedStage = completedStage;
	}

	public ProgramStage getPresentStage() {
		return presentStage;
	}

	public void setPresentStage(ProgramStage presentStage) {
		this.presentStage = presentStage;
	}

	public String getApprovalMatter() {
		return approvalMatter;
	}

	public void setApprovalMatter(String approvalMatter) {
		this.approvalMatter = approvalMatter;
	}

	public String getCompleteMatter() {
		return completeMatter;
	}

	public void setCompleteMatter(String completeMatter) {
		this.completeMatter = completeMatter;
	}

	public String getDrawingsMatter() {
		return drawingsMatter;
	}

	public void setDrawingsMatter(String drawingsMatter) {
		this.drawingsMatter = drawingsMatter;
	}

	public ProgramType getProgramType() {
		return programType;
	}

	public void setProgramType(ProgramType programType) {
		this.programType = programType;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public boolean isEnsured() {
		return isEnsured;
	}

	public void setEnsured(boolean isEnsured) {
		this.isEnsured = isEnsured;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
}
