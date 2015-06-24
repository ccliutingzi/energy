/**
 * 
 */
package com.energy.weixin.entity;

/**
 * 分页实体
 * 
 * @author tf
 * 
 */
public class Page {
	// 页码，默认是第一页
	private int pageIndex = 1;
	// 每页显示的记录数，默认是15
	private int pageSize = 15;
	public int getPageIndex() {
		return pageIndex;
	}
	public void setPageIndex(int pageIndex) {
		this.pageIndex = pageIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
}
