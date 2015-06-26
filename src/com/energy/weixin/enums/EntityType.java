package com.energy.weixin.enums;

/**
 * @ClassName: EntityType
 * @Description: 实体类型
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum EntityType {
	// QD为签到，QJ为请假，BX为报销，SP为审批，HY为会议室预定，XM为项目管理
	QD(0), QJ(1), BX(2), SP(3), HY(4), XM(5);
	private int index;

	private EntityType(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
