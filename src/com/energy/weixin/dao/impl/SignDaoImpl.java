package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.ISignDao;
import com.energy.weixin.entity.Sign;

/**
 * 签到DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class SignDaoImpl implements ISignDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加签到信息
	 */
	private static final String ADDSIGN_SQL = "addSign";
	/**
	 * 获取所有签到信息
	 */
	private static final String GETSIGNSTODAY_SQL = "getSignsToday";
	/**
	 * 根据id获取签到信息
	 */
	private static final String GETSIGNBYID_SQL = "getSignById";
	/**
	 * 根据id删除签到信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新签到信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addSign(Sign sign) {
		baseDao.insert(ADDSIGN_SQL, sign);
	}

	@Override
	public List<Sign> signsToday() {
		return baseDao.selectList(GETSIGNSTODAY_SQL);
	}

	@Override
	public Sign getSignById(String id) {
		return baseDao.selectOne(GETSIGNBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(Sign sign) {
		baseDao.update(UPDATE_SQL, sign);
	}

}
