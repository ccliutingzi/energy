/**
 * 
 */
package com.energy.weixin.utils;

import com.energy.weixin.cache.impl.DefaultCache;

/**
 * 系统缓存
 * 
 * @author tf
 * 
 *         2015年6月26日
 */
public class SystemCacheUtil {

	private static SystemCacheUtil instance;

	private DefaultCache<Object> defaultCache;

	private SystemCacheUtil() {
		defaultCache = new DefaultCache<Object>();
	}

	public static SystemCacheUtil getInstance() {
		if (null == instance) {
			synchronized (SystemCacheUtil.class) {
				if (null == instance) {
					instance = new SystemCacheUtil();
				}
			}
		}
		return instance;
	}

	public DefaultCache<Object> getDefaultCache() {
		return defaultCache;
	}
}
