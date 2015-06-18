package com.energy.weixin.enums;

/** 
 * @ClassName: PositionType 
 * @Description: 职务/岗位类型
 * @author CCLIU 
 * @date 2015-6-11 上午11:51:34 
 * v1.0
 */
public enum PositionType {
	// 0-主设，1-校核
	主设(0), 校核(1);
		
	private int index = 0;

    private PositionType(int index) {
        this.index = index;
    }

    public static PositionType valueOf(int index) {
        switch (index) {
        case 0:
            return 主设;
        case 1:
            return 校核;
        default:
            return null;
        }
    }

    public int index() {
        return this.index;
    }

}
