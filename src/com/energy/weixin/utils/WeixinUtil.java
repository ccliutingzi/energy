package com.energy.weixin.utils;

import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.constant.Constants;

/** 
 * @ClassName: WeixinUtil 
 * @Description: 微信相关辅助类
 * @author CCLIU 
 * @date 2015-6-26 下午3:04:45 
 * v1.0
 */
public class WeixinUtil {
	
	private final static String CORPID = ConfigUtil.get(Constants.WEIXIN_APP_PATH, "corpId");
	private final static String SECRET = ConfigUtil.get(Constants.WEIXIN_APP_PATH, "secret");
	
	public static JSONObject getAccessToken() throws Exception{
		String url = ConfigUtil.get(Constants.WEIXIN_APP_PATH, "access_token_url");
		return HttpsUtil.post(url,"corpid=" +CORPID+"&corpsecret="+SECRET);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			System.out.print(getAccessToken().toJSONString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
