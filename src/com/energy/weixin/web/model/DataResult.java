package com.energy.weixin.web.model;

import java.util.ArrayList;
import java.util.List;

/**
 * 返回前端数据模型
 * 
 * @author tf
 * 
 *         2015年6月25日
 * @param <T>
 */
public class DataResult<T> {

	/**
	 * 总数
	 */
	private int total;
	/**
	 * 数据
	 */
	private List<T> dataList = new ArrayList<T>();

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

}
