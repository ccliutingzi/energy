package com.energy.weixin.web.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回前端数据模型
 * 
 * @author tf
 * 
 *         2015年6月25日
 */
public class DataResult {

	/**
	 * 总数
	 */
	private int total;
	/**
	 * 数据
	 */
	private List<Object> dataList = new ArrayList<Object>();

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<Object> getDataList() {
		return dataList;
	}

	public void setDataList(List<Object> dataList) {
		this.dataList = dataList;
	}

}
