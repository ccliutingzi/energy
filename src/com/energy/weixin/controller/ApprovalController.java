package com.energy.weixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @ClassName: ApprovalController 
 * @Description: 审批相关请求处理器
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
@Controller
@RequestMapping(value = "/approval")
public class ApprovalController {

	//@Autowired

	@RequestMapping(method = RequestMethod.GET)
	public String page1(ModelMap model) {
		model.addAttribute("", "");
		return "hello";
	}
	
	@RequestMapping(value = "mypage",method = RequestMethod.GET)
	public String page2(ModelMap model) {
		model.addAttribute("myparam", "1");
		return "mypage";
	}

}
