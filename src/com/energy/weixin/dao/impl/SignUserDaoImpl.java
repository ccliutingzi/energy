package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.ISignUserDao;
import com.energy.weixin.entity.SignUser;

/**
 * 签到-用户DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class SignUserDaoImpl implements ISignUserDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加签到-用户信息
	 */
	private static final String ADDSIGNUSER_SQL = "addSignUser";
	/**
	 * 获取所有签到-用户信息
	 */
	private static final String GETALLSIGNUSER_SQL = "getAllSignUser";
	/**
	 * 根据id获取签到-用户信息
	 */
	private static final String GETSIGNUSERBYID_SQL = "getSignUserById";
	/**
	 * 根据id删除签到-用户信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新签到-用户信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addSignUser(SignUser signUser) {
		baseDao.insert(ADDSIGNUSER_SQL, signUser);
	}

	@Override
	public List<SignUser> getAllSignUser() {
		return baseDao.selectList(GETALLSIGNUSER_SQL);
	}

	@Override
	public SignUser getSignUserById(String id) {
		return baseDao.selectOne(GETSIGNUSERBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);

	}

	@Override
	public void update(SignUser signUser) {
		baseDao.update(UPDATE_SQL, signUser);
	}

}
