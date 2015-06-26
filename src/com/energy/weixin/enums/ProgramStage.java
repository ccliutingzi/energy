package com.energy.weixin.enums;

/**
 * @ClassName: ProgramStage
 * @Description: 项目所属阶段
 * @author CCLIU
 * @date 2015-6-11 上午11:51:34 v1.0
 */
public enum ProgramStage {
	// 0-可研、1-初设、2-施工图、3-竣工图
	可研(0), 初设(1), 施工图(2), 竣工图(3);

	private int index = 0;

	private ProgramStage(int index) {
		this.index = index;
	}

	public static ProgramStage valueOf(int index) {
		switch (index) {
		case 0:
			return 可研;
		case 1:
			return 初设;
		case 2:
			return 施工图;
		case 3:
			return 竣工图;
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
