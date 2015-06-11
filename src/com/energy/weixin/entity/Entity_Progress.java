package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Entity_Progress 
 * @Description: 实体-进展对应类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Entity_Progress implements Serializable {

	private static final long serialVersionUID = 357303186062685469L;
	
	/*
	 * 实体ID 
	 */
	private String entityID;
	/*
	 * 最新进展内容
	 */
	private String content;

	public Entity_Progress() {
		super();
	}
	
	public Entity_Progress(String entityID, String content) {
		super();
		this.entityID = entityID;
		this.content = content;
	}

	public String getEntityID() {
		return entityID;
	}

	public void setEntityID(String entityID) {
		this.entityID = entityID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
