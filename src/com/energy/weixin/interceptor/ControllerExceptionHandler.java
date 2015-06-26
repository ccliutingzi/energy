/**
 * 
 */
package com.energy.weixin.interceptor;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * 异常统一处理拦截器
 * @author tf
 *
 * 2015年6月26日
 */

/**
 * 常量类
 * 
 * @author tf
 * @date 2015年06月26日
 */
public class ControllerExceptionHandler implements HandlerExceptionResolver {
	private static Logger LOG = Logger.getLogger(ControllerExceptionHandler.class);

	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("title", "系统异常");
		model.put("msg", "请联系系统管理员");
		LOG.error("系统异常", ex);
		return new ModelAndView("error", model);
	}
}
