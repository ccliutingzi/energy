/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IAbsentDao;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.service.IAbsentService;

/**
 * 请假服务
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("absentService")
public class AbsentServiceImpl implements IAbsentService {
	/**
	 * 请假处理
	 */
	@Autowired
	private IAbsentDao absentDao;

	@Override
	public void addAbsent(Absent absent) {
		absentDao.addAbsent(absent);
	}

	@Override
	public List<Absent> getAllAbsent() {
		return absentDao.getAllAbsent();
	}

	@Override
	public Absent getAbsentById(String id) {
		return absentDao.getAbsentById(id);
	}

	@Override
	public void deleteById(String id) {
		absentDao.deleteById(id);
	}

	@Override
	public void update(Absent absent) {
		absentDao.update(absent);
	}
}
