/**
 * 
 */
package com.energy.weixin.exception;

/**
 * energy异常
 * @author tf
 * 
 *         2015年6月29日 上午9:41:45
 */
public class EnergyException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7899365293345477282L;

	public EnergyException(String exceptionCode) {
		super(exceptionCode);
	}

	public EnergyException() {
		super();
	}

	public EnergyException(String message, Throwable cause) {
		super(message, cause);
	}

	public EnergyException(Throwable cause) {
		super(cause);
	}

}
