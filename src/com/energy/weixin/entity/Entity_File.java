package com.energy.weixin.entity;

import java.io.Serializable;

/** 
 * @ClassName: Entity_File 
 * @Description: 实体-文件对应类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Entity_File implements Serializable {

	private static final long serialVersionUID = -2347687637404299888L;
	
	/*
	 * 实体ID
	 */
	private String entityId;
	/*
	 * 文件ID
	 */
	private String fileId;
	
	public Entity_File() {
		super();
	}

	public Entity_File(String entityId, String fileId) {
		super();
		this.entityId = entityId;
		this.fileId = fileId;
	}

	public String getEntityId() {
		return entityId;
	}

	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}

	public String getFileId() {
		return fileId;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}

}
