package com.energy.weixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/** 
 * @ClassName: CommonController 
 * @Description: 通用相关请求处理器
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
@Controller
@RequestMapping(value = "/common")
public class CommonController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap model) {
		return "index";
	}
	
}
