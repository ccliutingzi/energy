package com.energy.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.energy.weixin.entity.Sign;
import com.energy.weixin.mapper.SignMapper;
import com.energy.weixin.utils.CommonUtil;

/** 
 * @ClassName: SignController 
 * @Description: 签到相关请求处理器
 * @author CCLIU 
 * @date 2015-6-11 上午11:05:22 
 * v1.0
 */
@Controller
@RequestMapping(value = "/sign")
public class SignController {

	@Autowired
	private SignMapper signMapper;

	/**
	 * 签到处，显示今天所有的签到信息
	 * @return
	 */
	@RequestMapping(value="signsOfToday", method = RequestMethod.GET)
	public ModelAndView signsOfToday() {
		ModelAndView view = new ModelAndView("sign_add");
		view.addObject("result", "OK");
		return view;
	}
	
	@RequestMapping(value="addSign", method = RequestMethod.GET)
	public String addSign(ModelMap model) {
		try{
			signMapper.addSign(new Sign(CommonUtil.GeneGUID(), "123456", null, null, null, null, null));
			model.addAttribute("result", "OK");
		} catch (Exception e){
			model.addAttribute("result", "ERROR");
		}
		return "sign_add";
	}

}
