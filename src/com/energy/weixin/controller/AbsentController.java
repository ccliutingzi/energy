package com.energy.weixin.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.energy.weixin.entity.Absent;
import com.energy.weixin.service.IAbsentService;
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
		// 获取请假申请信息
		Map<String, Object> requestParams = getRequestParams(request);
		Absent absent = new Absent();
		
		absentService.addAbsent(absent);
		// 响应数据
		ResponseResult responseResult = new ResponseResult();
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
		absent.setUserName("ft");
		absent.setUserId("1111");
		absentService.addAbsent(absent);
		return "mypage";
	}

	@RequestMapping(value = "mypage1", method = RequestMethod.GET)
	public String page3(ModelMap model) {
		model.addAttribute("myparam", "1");
		Absent absent = new Absent();
		absent.setUserName("ft");
		absent.setUserId("1111");
		absentService.getAllAbsent();
		return "mypage";
	}

}
