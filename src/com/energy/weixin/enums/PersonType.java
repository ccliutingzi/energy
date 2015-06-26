package com.energy.weixin.enums;

/**
 * @ClassName: PersonType
 * @Description: 人员类型，对应流程中涉及的角色
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum PersonType {
	// SH为审核，CS为抄送，CW为财务
	SH(0), CS(1), CW(2);
	
	private int index;

	private PersonType(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
