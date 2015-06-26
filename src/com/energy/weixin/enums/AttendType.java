package com.energy.weixin.enums;

/**
 * @ClassName: AttendType
 * @Description: 出勤类型
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum AttendType {
	// QD为签到，QT为签退
	QD(0), QT(1);
	private int index = 0;

	private AttendType(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
