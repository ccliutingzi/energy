/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.ISignDao;
import com.energy.weixin.entity.Sign;
import com.energy.weixin.service.ISignService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("signService")
public class SignServiceImpl implements ISignService {

	@Autowired
	private ISignDao signDao;

	@Override
	public void addSign(Sign sign) {
		signDao.addSign(sign);
	}

	@Override
	public List<Sign> signsToday() {
		return signDao.signsToday();
	}

	@Override
	public Sign getSignById(String id) {
		return signDao.getSignById(id);
	}

	@Override
	public void deleteById(String id) {
		signDao.deleteById(id);
	}

	@Override
	public void update(Sign sign) {
		signDao.update(sign);
	}
}
