package com.energy.weixin.utils;

import java.util.UUID;

/** 
 * @ClassName: CommonUtil 
 * @Description: 工具类
 * @author CCLIU 
 * @date 2015-6-18 下午3:35:32 
 * v1.0
 */
public class CommonUtil {
	
	/**
	 * 获取32位GUID
	 * @return
	 */
	public static String GeneGUID(){
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print(GeneGUID().length()+"");
	}

}
