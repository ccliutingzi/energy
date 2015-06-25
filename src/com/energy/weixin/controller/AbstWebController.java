/**
 * 
 */
package com.energy.weixin.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.web.servlet.ModelAndView;

/**
 * 抽象controller
 * 
 * @author tf
 * 
 *         2015年6月25日
 */
public abstract class AbstWebController {

	/**
	 * http request 请求参数获取
	 * 
	 * @param request
	 *            http 请求
	 * @return 返回获取的http请求参数
	 */
	@SuppressWarnings("unchecked")
	protected Map<String, Object> getRequestParams(HttpServletRequest request) {
		// 请求参数
		Map<String, Object> requestParams = new HashMap<String, Object>();
		requestParams.putAll(request.getParameterMap());
		try {
			Enumeration<String> enumeration = null;
			if (ServletFileUpload.isMultipartContent(request)) {
				ServletFileUpload Uploader = new ServletFileUpload(new DiskFileItemFactory());
				Uploader.setHeaderEncoding("utf-8");
				List<FileItem> fileItems = Uploader.parseRequest(request);
				for (FileItem item : fileItems) {
					requestParams.put(item.getFieldName(), item);
				}
			} else {
				// 获取parmeter中参数
				enumeration = request.getParameterNames();
				if (null != enumeration) {
					String key = null;
					String value = null;
					while (enumeration.hasMoreElements()) {
						key = enumeration.nextElement();
						value = request.getParameter(key);
						requestParams.put(key, new String(value.getBytes("ISO8859-1"), "utf-8"));
					}
				}
			}
			// 获取attribute中参数
			enumeration = request.getAttributeNames();
			if (null != enumeration) {
				String key = null;
				while (enumeration.hasMoreElements()) {
					key = enumeration.nextElement();
					requestParams.put(key, request.getAttribute(key));
				}
			}
		} catch (Exception e) {
		}
		return requestParams;
	}

	/**
	 * 根据视图名称创建 modelAndView 视图对象
	 * 
	 * @param viewName
	 *            视图名称
	 * @return 返回视图对象
	 */
	public ModelAndView createModelAndView(String viewName) {
		return new ModelAndView(getPrefix() + viewName);
	}

	/**
	 * 获取控制对象视图前缀 例如:jsp/xxxx 子类需要根据业务情况重写该类
	 * 
	 * @return 返回视图前缀
	 */
	protected String getPrefix() {
		return "jsp";
	}
}
