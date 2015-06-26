package com.energy.weixin.enums;

/**
 * @ClassName: ChiefType
 * @Description: 负责人类型
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum ChiefType {
	// 0-纵队负责人，1-项目部负责人，2-营销负责人，3-营销支出负责人，4-设计负责人，5-运营经理
	纵队负责人(0), 项目部负责人(1), 营销负责人(2), 营销支出负责人(3), 设计负责人(4), 运营经理(5);

	private int index = 0;

	private ChiefType(int index) {
		this.index = index;
	}

	public static ChiefType valueOf(int index) {
		switch (index) {
		case 0:
			return 纵队负责人;
		case 1:
			return 项目部负责人;
		case 2:
			return 营销负责人;
		case 3:
			return 营销负责人;
		case 4:
			return 设计负责人;
		case 5:
			return 运营经理;
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
