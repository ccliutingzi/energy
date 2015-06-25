/**
 * 
 */
package com.energy.weixin.utils;

import org.apache.commons.lang.StringUtils;

/**
 * @author tf
 * 
 *         2015年6月25日
 */
public class StringUtil extends StringUtils {
	
	/**
	 * 获得对象描述字符串
	 * 
	 * @param obj
	 * @return 字符串
	 */
	public static String getString(Object obj) {
		if (obj != null) {
			return obj.toString();
		} else {
			return null;
		}
	}
}
