package com.energy.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.energy.weixin.entity.Absent;
import com.energy.weixin.service.IAbsentService;

/** 
 * @ClassName: AbsentController 
 * @Description: 请假相关请求处理器
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
@Controller
@RequestMapping(value = "/absent")
public class AbsentController {
	
	@Autowired
	private IAbsentService absentService;

	@RequestMapping(method = RequestMethod.GET)
	public String page1(ModelMap model) {
		model.addAttribute("", "");
		return "hello";
	}
	
	@RequestMapping(value = "mypage",method = RequestMethod.GET)
	public String page2(ModelMap model) {
		model.addAttribute("myparam", "1");
		Absent absent = new Absent();
		absent.setUserName("ft");
		absent.setUserId("1111");
		absentService.addAbsent(absent);
		return "mypage";
	}
	@RequestMapping(value = "mypage1",method = RequestMethod.GET)
	public String page3(ModelMap model) {
		model.addAttribute("myparam", "1");
		Absent absent = new Absent();
		absent.setUserName("ft");
		absent.setUserId("1111");
		absentService.getAllAbsent();
		return "mypage";
	}

}
