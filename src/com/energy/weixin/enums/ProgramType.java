package com.energy.weixin.enums;

/**
 * @ClassName: ProgramType
 * @Description: 项目类型
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum ProgramType {
	// 0-配网，1-主网
	配网(0), 主网(1);

	private int index = 0;

	private ProgramType(int index) {
		this.index = index;
	}

	public static ProgramType valueOf(int index) {
		switch (index) {
		case 0:
			return 配网;
		case 1:
			return 主网;
		default:
			return null;
		}
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
