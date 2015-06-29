package com.energy.weixin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.entity.Accessory;
import com.energy.weixin.service.IExpenseService;
import com.energy.weixin.utils.StringUtil;
import com.energy.weixin.web.model.ResponseResult;

/**
 * @ClassName: ExpenseController
 * @Description: 报销相关请求处理器
 * @author CCLIU
 * @date 2015-6-11 上午11:05:22 v1.0
 */
@Controller
@RequestMapping(value = "/expense")
public class ExpenseController extends AbstWebController {

	@Autowired
	private IExpenseService expenseService;

	/**
	 * 报销应用入口页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "mainView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView mainView() {
		return null;

	}

	/**
	 * 报销页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "createExpenseView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView createExpenseView() {
		ModelAndView modelView = createModelAndView("absent_add");
		return modelView;
	}

	/**
	 * 报销申请
	 * 
	 * @return
	 */
	@RequestMapping(value = "expenseApply", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody
	Object addExpense(HttpServletRequest request) {
		ResponseResult responseResult = new ResponseResult();
		// 获取请假申请信息
		Map<String, Object> requestParams = getRequestParams(request);
		String jsonAbsentApplyInfo = StringUtil.getString(requestParams.get("expenseApplyInfo"));
		List<FileItem> fileltems = (List<FileItem>) requestParams.get("fileltems");

		List<Accessory> fileList = new ArrayList<Accessory>();
		if (!CollectionUtils.isEmpty(fileltems)) {

		}

		Map<String, Object> testData = new HashMap<String, Object>();
		expenseService.doApply(JSONObject.toJSONString(testData),fileltems);
		return null;
	}

	/**
	 * 报销记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "expenseRecordView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView expenseRecordView() {
		ModelAndView modelView = createModelAndView("absent_add");
		return modelView;
	}

	@RequestMapping(method = RequestMethod.GET)
	public String page1(ModelMap model) {
		model.addAttribute("", "");
		return "hello";
	}

	@RequestMapping(value = "mypage", method = RequestMethod.GET)
	public String page2(ModelMap model) {
		model.addAttribute("myparam", "1");
		return "mypage";
	}
}
