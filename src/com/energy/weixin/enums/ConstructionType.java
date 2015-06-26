package com.energy.weixin.enums;

/** 
 * @ClassName: ConstructionType 
 * @Description: 建设类型
 * @author CCLIU 
 * @date 2015-6-11 上午11:51:34 
 * v1.0
 */
public enum ConstructionType {
	// XJ-新建，JG-技改，DX-大修
	XJ(0), JG(1), DX(2);
	private int index = 0;

	private ConstructionType(int index) {
		this.index = index;
	}

	public int index() {
		return this.index;
	}

	public String value() {
		return String.valueOf(index);
	}
}
