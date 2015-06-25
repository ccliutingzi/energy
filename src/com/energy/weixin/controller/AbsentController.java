package com.energy.weixin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.enums.AbsentType;
import com.energy.weixin.service.IAbsentService;
import com.energy.weixin.utils.StringUtil;
import com.energy.weixin.web.model.ResponseResult;

/**
 * @ClassName: AbsentController
 * @Description: 请假相关请求处理器
 * @author CCLIU
 * @date 2015-6-11 上午11:05:22 v1.0
 */
@Controller
@RequestMapping(value = "/absent")
public class AbsentController extends AbstWebController {

	@Autowired
	private IAbsentService absentService;

	/**
	 * 请假应用入口页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "mainView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView mainView() {
		return null;

	}

	/**
	 * 请假
	 * 
	 * @return
	 */
	@RequestMapping(value = "absentView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView absentView() {
		ModelAndView modelView = createModelAndView("absent_add");
		return modelView;
	}

	/**
	 * 请假申请
	 * 
	 * @return
	 */
	@RequestMapping(value = "absentApply", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody
	Object absentApply(HttpServletRequest request) {
		// 响应数据
		ResponseResult responseResult = new ResponseResult();
		// 获取请假申请信息
		Map<String, Object> requestParams = getRequestParams(request);
		String jsonAbsentApplyInfo = StringUtil.getString(requestParams.get("absentApplyInfo"));
		try {
			Map<String, Object> testData = new HashMap<String, Object>();
			testData.put("userId", "00001");
			testData.put("userName", "tf");
			testData.put("absentType", "0");
			testData.put("reason", "最近想休息");
			testData.put("position", "工程师");
			testData.put("department", "互联网");
			testData.put("beginTime", "2015-06-25 16:00");
			testData.put("endTime", "2015-06-26 16:00");
			testData.put("auditor", "00012");
			List<String> userList = new ArrayList<String>();
			userList.add("00011");
			userList.add("00013");
			testData.put("cc", userList);
			absentService.doApply(JSONObject.toJSONString(testData));
		} catch (Exception e) {
			e.printStackTrace();
			responseResult.setStatus(1);
		}
		// 返回数据
		return responseResult;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String page1(ModelMap model) {
		model.addAttribute("", "");
		return "hello";
	}

	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String page2(ModelMap model) {
		model.addAttribute("myparam", "1");
		Absent absent = new Absent();
		absentService.addAbsent(absent);
		return "mypage";
	}

	@RequestMapping(value = "mypage1", method = RequestMethod.GET)
	public @ResponseBody
	Object page3(ModelMap model) {
		Map<String, Object> resultData = new HashMap<String, Object>();
		resultData.put("a", "0");
		resultData.put("b", "0");
		resultData.put("c", "0");
		return resultData;
	}

}
