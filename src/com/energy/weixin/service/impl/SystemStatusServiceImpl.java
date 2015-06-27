/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.ISystemStatusDao;
import com.energy.weixin.entity.SystemStatus;
import com.energy.weixin.service.ISystemStatusService;

/**
 * @author tf
 * 
 *         2015年6月27日 下午7:27:55
 */
@Service
public class SystemStatusServiceImpl implements ISystemStatusService {

	@Autowired
	private ISystemStatusDao systemStatusDao;

	@Override
	public void addSystemStatus(SystemStatus systemStatus) {
		systemStatusDao.addSystemStatus(systemStatus);

	}

	@Override
	public List<SystemStatus> getSystemStatus(SystemStatus systemStatus) {
		return systemStatusDao.getSystemStatus(systemStatus);
	}

	@Override
	public void deleteById(String id) {
		systemStatusDao.deleteById(id);
	}

	@Override
	public void update(SystemStatus systemStatus) {
		systemStatusDao.update(systemStatus);

	}

}
