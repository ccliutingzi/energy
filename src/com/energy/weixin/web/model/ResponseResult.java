package com.energy.weixin.web.model;

/**
 * 响应
 * 
 * @author tf
 * 
 *         2015年6月25日
 */
public class ResponseResult {
	/**
	 * 状态
	 */
	private int status;
	/**
	 * 错误码 当状态不为0时使用
	 */
	private int errorCode;
	/**
	 * 错误消息
	 */
	private String errorMsg;
	/**
	 * 
	 */
	private DataResult dataResult;

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public DataResult getDataResult() {
		return dataResult;
	}

	public void setDataResult(DataResult dataResult) {
		this.dataResult = dataResult;
	}
}
