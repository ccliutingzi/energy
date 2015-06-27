/**
 * 
 */
package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.SystemStatus;

/**
 * @author tf
 * 
 *         2015年6月27日 下午7:27:30
 */
public interface ISystemStatusService {
	/**
	 * 添加系统状态
	 * 
	 * @param absent
	 */
	public void addSystemStatus(SystemStatus systemStatus);

	/**
	 * 获取系统状态信息
	 * 
	 * @return
	 */
	public List<SystemStatus> getSystemStatus(SystemStatus systemStatus);

	/**
	 * 根据id删除系统状态信息
	 * 
	 * @param id
	 */
	public void deleteById(String id);

	/**
	 * 更新系统状态信息
	 * 
	 * @param absent
	 */
	public void update(SystemStatus systemStatus);
}
