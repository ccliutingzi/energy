/**
 * 
 */
package com.energy.weixin.utils;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

/**
 * @author tf
 * 
 *         2015年6月25日
 */
public class ConfigUtil {

	private static ConfigUtil instance = new ConfigUtil();

	private static Map<String, PropertiesConfiguration> configMap = new HashMap<String, PropertiesConfiguration>();

	private boolean isAutoSave = true;

	private ConfigUtil() {
	}

	/**
	 * 获取内容
	 * 
	 * @param configFile
	 * @param property
	 * @return
	 */
	public static String get(String configFile, String property) {
		if (!configMap.containsKey(configFile)) {
			instance.initConfig(configFile);
		}
		PropertiesConfiguration config = configMap.get(configFile);
		if (null != config) {
			return configMap.get(configFile).getString(property);
		} else {
			return null;
		}
	}

	/**
	 * 载入配置文件，初始化后加入map
	 * 
	 * @param configFile
	 */
	private synchronized void initConfig(String configFile) {
		try {
			PropertiesConfiguration config = new PropertiesConfiguration(configFile);
			configMap.put(configFile, config);
			config.setAutoSave(isAutoSave);
		} catch (ConfigurationException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		System.out.println(ConfigUtil.get("resources\\config\\weixin_app.properties", "send_message_url"));
	}
}
