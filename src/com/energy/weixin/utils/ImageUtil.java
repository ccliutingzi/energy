/**
 * 
 */
package com.energy.weixin.utils;

import java.io.File;

/**
 * 图像工具类
 * 
 * @author tf
 * 
 * @date 2015年6月29日 上午10:41:30
 * @version 1.0
 */
public class ImageUtil {

	private static ImageUtil instance;

	public static ImageUtil getInstance() {
		if (null == instance) {
			synchronized (ImageUtil.class) {
				if (null == instance) {
					instance = new ImageUtil();
				}
			}
		}
		return instance;
	}

	public void zoomImage(File file) {

	}
}
