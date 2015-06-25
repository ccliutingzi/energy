/**
 * 
 */
package com.energy.weixin.web.api;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.utils.HttpsUtil;
import com.energy.weixin.web.enums.MessageType;

/**
 * @author tf
 * 
 *         2015年6月25日
 */
public class SendMessage {

	/**
	 * 发送消息url
	 */
	private static final String SEND_MESSAGE_URL = "https://qyapi.weixin.qq.com/cgi-bin/message/send?access_token=ACCESS_TOKEN";
	
	private static SendMessage instance;

	public static SendMessage getInstance() {
		if (instance == null) {
			synchronized (SendMessage.class) {
				if (instance == null) {
					instance = new SendMessage();
				}
			}
		}
		return instance;
	}

	/**
	 * 发送文本消息
	 * 
	 * @param message
	 * @throws Exception
	 */
	public Map<String, Object> sendText(Map<String, Object> message) throws Exception {

		message.put("msgtype", MessageType.text);
		return HttpsUtil.post(SEND_MESSAGE_URL, JSONObject.toJSONString(message));
	}

	/**
	 * 发送图片消息
	 * 
	 * @param message
	 */
	public Map<String, Object> sendImage(Map<String, Object> message) {
		return null;
	}

	/**
	 * 发送声音消息
	 * 
	 * @param message
	 */
	public Map<String, Object> sendVoice(Map<String, Object> message) {
		return null;

	}

	/**
	 * 发送视频消息
	 * 
	 * @param message
	 */
	public Map<String, Object> sendVideo(Map<String, Object> message) {
		return null;

	}

	/**
	 * 发送文件消息
	 * 
	 * @param message
	 */
	public Map<String, Object> sendFile(Map<String, Object> message) {
		return null;

	}

	/**
	 * 发送新闻消息
	 * 
	 * @param message
	 */
	public Map<String, Object> sendNews(Map<String, Object> message) {
		return null;

	}

	/**
	 * 发送图文消息
	 * 
	 * @param message
	 */
	public Map<String, Object> sendMpnews(Map<String, Object> message) {
		return null;

	}
}
