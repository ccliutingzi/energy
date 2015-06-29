package com.energy.weixin.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.energy.weixin.constant.Constants;
import com.energy.weixin.utils.ConfigUtil;
import com.energy.weixin.utils.WeixinUtil;
import com.energy.weixin.utils.wxutil.WXBizMsgCrypt;

/** 
 * @ClassName: CommonController 
 * @Description: 通用相关请求处理器
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
@Controller
@RequestMapping(value = "/common")
public class CommonController extends AbstWebController{
	
	/**
	 * 企业号应用验证
	 * @param model
	 * @return
	 */
	@RequestMapping(value="weixin", method = RequestMethod.GET)
	public void weixin(HttpServletRequest request, HttpServletResponse response) {
		// 请求参数
		Map<String, Object> params = getRequestParams(request);

		String sCorpID = ConfigUtil.get(Constants.WEIXIN_APP_PATH, "corpId");
		String sToken = ConfigUtil.get(Constants.WEIXIN_APP_PATH, "token");
		String sEncodingAESKey = ConfigUtil.get(Constants.WEIXIN_APP_PATH, "encodingAESKey");
		String sEchoStr = "init"; //需要返回的明文
		try {
			WXBizMsgCrypt wxcpt = new WXBizMsgCrypt(sToken, sEncodingAESKey, sCorpID);
			String sVerifyMsgSig = params.get("msg_signature").toString();
			String sVerifyTimeStamp = params.get("timestamp").toString();
			String sVerifyNonce = params.get("nonce").toString();
			String sVerifyEchoStr = params.get("echostr").toString();
			
			sEchoStr = wxcpt.VerifyURL(sVerifyMsgSig, sVerifyTimeStamp,
					sVerifyNonce, sVerifyEchoStr);
			System.out.println("verifyurl echostr: " + sEchoStr);
			response.getOutputStream().write(sEchoStr.getBytes());
			response.getOutputStream().flush();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
	}
	
	/**
	 * 企业号应用验证
	 * @param model
	 * @return
	 */
	@RequestMapping(value="test", method = RequestMethod.GET)
	public ModelAndView test(HttpServletRequest request, HttpServletResponse response) {
		// 请求参数
		Map<String, Object> params = getRequestParams(request);
		String code = params.get("code").toString();
		String state = params.get("state").toString();
		try {
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ModelAndView("index");
	}
	
}
