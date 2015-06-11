package com.energy.weixin.entity;

import java.io.Serializable;

public class Entity_File implements Serializable {

	private static final long serialVersionUID = 3647233284813657927L;

	private String id;
	private String userName;
	private String password;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
