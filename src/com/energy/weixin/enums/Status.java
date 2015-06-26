package com.energy.weixin.enums;

/**
 * @ClassName: Status
 * @Description: 状态枚举类
 * @author CCLIU
 * @date 2015-6-11 上午11:20:04 v1.0
 */
public enum Status {
	// 0-草稿，1-待审核，2-审核中，3-已审核，4-待报销，5-已报销，6-实施中，7-结束确认中，8-已结束
	草稿(0), 待审核(1), 审核中(2), 已审核(3), 待报销(4), 已报销(5), 实施中(6), 结束确认中(7), 已结束(8);

	private int index = 0;

	private Status(int index) {
		this.index = index;
	}

	public static Status valueOf(int index) {
		switch (index) {
		case 0:
			return 待审核;
		case 1:
			return 审核中;
		case 2:
			return 已审核;
		case 3:
			return 待报销;
		case 4:
			return 已报销;
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
