package com.energy.weixin.enums;

/**
 * @ClassName: ProgramNature
 * @Description: 项目性质
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum ProgramNature {
	// XT-系统，YK-业扩
	XT(0), YK(1);
	private int index;

	private ProgramNature(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
