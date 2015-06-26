package com.energy.weixin.enums;

/**
 * @ClassName: AccountType
 * @Description: 账户类型，对应微信企业号中的部门，标签，用户
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum AccountType {
	// D为部门，T为标签，U为用户
	D(0), T(1), U(2);
	private int index = 0;

	private AccountType(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
