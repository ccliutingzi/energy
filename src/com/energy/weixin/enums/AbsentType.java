package com.energy.weixin.enums;

/** 
 * @ClassName: AbsentType 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author CCLIU 
 * @date 2015-6-11 上午11:31:59 
 * v1.0
 */
public enum AbsentType {
	// 0-事假, 1-病假, 2-丧假, 3-产假, 4-特殊休假, 5-其他;
	事假(0), 病假(1), 丧假(2), 产假(3), 特殊休假(4), 其他(5);
	
	private int index = 0;

    private AbsentType(int index) {
        this.index = index;
    }

    public static AbsentType valueOf(int index) {
        switch (index) {
        case 0:
            return 事假;
        case 1:
            return 病假;
        case 2:
            return 丧假;
        case 3:
            return 产假;
        case 4:
            return 特殊休假;
        case 5:
            return 其他;
        default:
            return null;
        }
    }

    public int index() {
        return this.index;
    }

}
