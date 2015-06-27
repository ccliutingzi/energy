package com.energy.weixin.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONObject;
import com.energy.weixin.constant.Constants;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.entity.SystemStatus;
import com.energy.weixin.service.IAbsentService;
import com.energy.weixin.service.IEntityAccountService;
import com.energy.weixin.service.ISystemStatusService;
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
	@Autowired
	private IEntityAccountService entityAccountService;
	@Autowired
	private ISystemStatusService systemStatusService;

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

	/**
	 * 请假记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "absentRecordView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView absentRecordView() {
		ModelAndView modelView = createModelAndView("absent_record");
		return modelView;
	}

	/**
	 * 获取请假记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "getAbsentRecord", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody
	Object getAbsentRecord(HttpServletRequest request) {
		// 获取请假申请信息
		Map<String, Object> requestParams = getRequestParams(request);
		String spageIndex = StringUtil.getString(requestParams.get("pageIndex"));
		String spageSize = StringUtil.getString(requestParams.get("pageSize"));
		String status = StringUtil.getString(requestParams.get("status"));
		int pageIndex = -1;
		int pageSize = -1;
		if (StringUtil.isNotEmpty(spageIndex)) {
			pageIndex = Integer.valueOf(spageIndex);
		}
		if (StringUtil.isNotEmpty(spageSize)) {
			pageSize = Integer.valueOf(spageSize);
		}
		Absent absent = new Absent();
		if (StringUtil.isNotEmpty(status)) {
			absent.setStatus(status);
		}
		return absentService.queryAbsentRecord(absent, pageIndex, pageSize);
	}

	/**
	 * 审核记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "auditRecordView", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView auditRecordView() {
		ModelAndView modelView = createModelAndView("audit_record");
		return modelView;
	}

	/**
	 * 获取审核记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "getAuditRecord", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody
	Object getAuditRecord(HttpServletRequest request) {
		// 获取请假申请信息
		Map<String, Object> requestParams = getRequestParams(request);
		String spageIndex = StringUtil.getString(requestParams.get("pageIndex"));
		String spageSize = StringUtil.getString(requestParams.get("pageSize"));
		String dealResult = StringUtil.getString(requestParams.get("dealResult"));
		int pageIndex = -1;
		int pageSize = -1;
		if (StringUtil.isNotEmpty(spageIndex)) {
			pageIndex = Integer.valueOf(spageIndex);
		}
		if (StringUtil.isNotEmpty(spageSize)) {
			pageSize = Integer.valueOf(spageSize);
		}
		EntityAccount entityAccount = new EntityAccount();
		if (StringUtil.isNotEmpty(dealResult)) {
			entityAccount.setDealResult(dealResult);
		}
		return entityAccountService.queryEntityAccountRecord(entityAccount, pageIndex, pageSize);
	}

	/**
	 * 获取审核记录
	 * 
	 * @return
	 */
	@RequestMapping(value = "getAbsentType", method = { RequestMethod.GET, RequestMethod.POST })
	public @ResponseBody
	Object getAbsentType(HttpServletRequest request) {
		// 获取请假申请信息
		SystemStatus systemStatus = new SystemStatus();
		systemStatus.setType(Constants.SYSTEM_ABSENT_TYPE);
		return systemStatusService.getSystemStatus(systemStatus);
	}
}
