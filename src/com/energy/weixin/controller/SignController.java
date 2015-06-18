package com.energy.weixin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.energy.weixin.entity.Sign;
import com.energy.weixin.mapper.SignMapper;

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

	@RequestMapping(value="addSign", method = RequestMethod.GET)
	public String addSign(ModelMap model) {
		try{
			signMapper.addSign(new Sign("1", "123", "刘闯闯", null, null, null, null));
			model.addAttribute("result", "OK");
		} catch (Exception e){
			model.addAttribute("result", "ERROR");
		}
		return "sign_add";
	}

}
