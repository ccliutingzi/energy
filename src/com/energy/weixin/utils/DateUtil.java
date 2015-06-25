/**
 * 
 */
package com.energy.weixin.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author tf
 * 
 *         2015年6月25日
 */
public class DateUtil {

	public static final String FORMATPATTERN = "yyyy-mm-dd HH:ss:mm";

	/**
	 * 字符串转换日期
	 * 
	 * @param str
	 * @return
	 */
	public static Date stringToDate(String str, String parsePattern) {
		// str = " 2008-07-10 19:20:00 " 格式
		SimpleDateFormat format = new SimpleDateFormat(parsePattern);
		if (!str.equals("") && str != null) {
			try {
				return format.parse(str);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	/**
	 * 字符串转换日期
	 * 
	 * @param str
	 * @return
	 */
	public static Date stringToDate(String str) {
		return stringToDate(str, FORMATPATTERN);
	}

}
