package com.energy.weixin.enums;

/**
 * @ClassName: SignType
 * @Description: 签到类型
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum SignType {
	// KQ为考勤签到，QT为其他签到
	KQ(0), QT(1);
	private int index;

	private SignType(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
