package com.energy.weixin.entity;

import java.io.Serializable;
import java.util.Date;

/** 
 * @ClassName: Program 
 * @Description: 项目类
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
public class Program implements Serializable {
 
	private static final long serialVersionUID = -2123103060365888872L;
	
	/*
	 * ID
	 */
	private String id;
	/*
	 * 请假发起人用户ID
	 */
	private String userId;
	/*
	 * 请假发起人用户姓名
	 */
	private String userName;
}
