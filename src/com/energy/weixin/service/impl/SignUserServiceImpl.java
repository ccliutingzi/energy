/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.ISignUserDao;
import com.energy.weixin.entity.SignUser;
import com.energy.weixin.service.ISignUserService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("signUserService")
public class SignUserServiceImpl implements ISignUserService {

	@Autowired
	private ISignUserDao signUserDao;

	@Override
	public void addSignUser(SignUser signUser) {
		signUserDao.addSignUser(signUser);

	}

	@Override
	public List<SignUser> getAllSignUser() {
		return signUserDao.getAllSignUser();
	}

	@Override
	public SignUser getSignUserById(String id) {
		return signUserDao.getSignUserById(id);
	}

	@Override
	public void deleteById(String id) {
		signUserDao.deleteById(id);
	}

	@Override
	public void update(SignUser signUser) {
		signUserDao.update(signUser);
	}

}
