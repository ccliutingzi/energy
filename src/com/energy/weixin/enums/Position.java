package com.energy.weixin.enums;

/** 
 * @ClassName: Position 
 * @Description: 职务/岗位
 * @author CCLIU 
 * @date 2015-6-11 上午11:51:34 
 * v1.0
 */
public enum Position {
	// 0-设总、1-变电一次设计、2-变电二次、3-土建、4-水工、5-暖通、
	// 6-技经、7-系统、8-通信，9-设计、10-报物资人员
	设总(0), 变电一次设计(1), 变电二次(2), 土建(3), 水工(4), 暖通(5)
	, 技经(6), 系统(7), 通信(8), 设计(9), 报物资人员(10);
		
	private int index = 0;

    private Position(int index) {
        this.index = index;
    }

    public static Position valueOf(int index) {
        switch (index) {
        case 0:
            return 设总;
        case 1:
            return 变电一次设计;
        case 2:
            return 变电二次;
        case 3:
            return 土建;
        case 4:
            return 水工;
        case 5:
            return 暖通;
        case 6:
            return 技经;
        case 7:
            return 系统;
        case 8:
            return 通信;
        case 9:
            return 设计;
        case 10:
            return 报物资人员;
        default:
            return null;
        }
    }

    public int index() {
        return this.index;
    }
    
    /*
     * 根据职位类型，获取职位列表
     */
    public Position[] getByType(PositionType type){
    	switch (type) {
        case 主设:
            return new Position[]{设总,变电一次设计,变电二次,土建,水工,暖通,技经,系统,通信};
        case 校核:
        	return new Position[]{设总,设计,报物资人员,技经};
        default:
            return null;
        }
    }
    
}
