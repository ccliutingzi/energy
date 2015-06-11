package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Meeting_Building 
 * @Description: 楼栋/楼层类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Meeting_Building implements Serializable {

	private static final long serialVersionUID = -3062090903142736888L;
	
	/*
	 * 大楼ID
	 */
	private String id;
	/*
	 * 楼栋/楼层名称
	 */
	private String buildingName;

	public Meeting_Building(String id, String buildingName) {
		super();
		this.id = id;
		this.buildingName = buildingName;
	}

	public Meeting_Building() {
		super();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
}
