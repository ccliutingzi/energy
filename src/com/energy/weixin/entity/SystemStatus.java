/**
 * 
 */
package com.energy.weixin.entity;

import java.io.Serializable;

/**
 * 
 * @author tf
 * 
 *         2015年6月27日 下午6:32:58
 */
public class SystemStatus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 唯一id
	 */
	private String id;

	/**
	 * 类型
	 */
	private String type;

	/**
	 * 状态
	 */
	private String status;

	/**
	 * 名称
	 */
	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
