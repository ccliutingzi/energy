package com.energy.weixin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

	//@Autowired

	/**
	 * 签到处，显示今天所有的签到信息
	 * @return
	 */
	@RequestMapping(value="signsToday", method = RequestMethod.GET)
	public ModelAndView signsOfToday( ) {
		ModelAndView view = new ModelAndView("sign_today");
		// TODO 取出今天的所有签到信息
		//List<Sign> signs = signMapper.signsToday();
		view.addObject("result", "OK");
		return view;
	}
	
	/**
	 * 签到详情
	 * @return
	 */
	@RequestMapping(value="signDetail", method = RequestMethod.GET)
	public ModelAndView signDetail() {
		ModelAndView view = new ModelAndView("sign_detail");
		// TODO 取出一个签到的详情
		view.addObject("result", "OK");
		return view;
	}
	
	/**
	 * 进行签到
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="signIn", method = RequestMethod.GET)
	public String signIn() {
		// TODO 新增签到信息
		return "OK";
	}
	
	/**
	 * 进行签退
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="signOut", method = RequestMethod.GET)
	public String signOut() {
		// TODO 新增签退信息
		return "OK";
	}
	
	/**
	 * 添加/修改备注
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="editRemark", method = RequestMethod.GET)
	public String editRemark() {
		// TODO 编辑签到的备注
		return "OK";
	}
	
	/**
	 * 发起签到页面
	 * @param model
	 * @return
	 */
	@RequestMapping(value="addSign", method = RequestMethod.GET)
	public String addSign(ModelMap model) {
		return "sign_add";
	}
	
	/**
	 * 添加签到信息
	 * @param model
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="doAdd", method = RequestMethod.GET)
	public String doAdd() {
		try{
			// TODO 插入数据
			//signMapper.addSign(new Sign(CommonUtil.GeneGUID(), "NT10101001", "张至栋", "考勤签到", new Date(), new Date(), SignType.KQ));
			// TODO 向相关的人员发送签到消息
		} catch (Exception e){
		}
		return "123";
	}

	/**
	 * 根据月份查询当月统计
	 * @return
	 */
	public ModelAndView queryByMonth(){
		ModelAndView view = new ModelAndView();
		// TODO 取出当月统计数据
		view.addObject("result", "OK");
		return view;
	}
	
}
