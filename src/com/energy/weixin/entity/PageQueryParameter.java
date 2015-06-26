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
public class PageQueryParameter {
	// 页码，默认是第一页
	private int pageIndex = 1;
	// 每页显示的记录数，默认是15
	private int pageSize = 15;
	// 是否分页
	private boolean isPage;
	// 分页参数
	private Object parameter;

	private String orderBy;

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

	public Object getParameter() {
		return parameter;
	}

	public void setParameter(Object parameter) {
		this.parameter = parameter;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public boolean isPage() {
		return isPage;
	}

	public void setPage(boolean isPage) {
		this.isPage = isPage;
	}

}
