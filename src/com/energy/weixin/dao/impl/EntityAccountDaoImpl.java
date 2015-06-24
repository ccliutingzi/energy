package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityAccountDao;
import com.energy.weixin.entity.EntityAccount;

/**
 * 实体-账户DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class EntityAccountDaoImpl implements IEntityAccountDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加实体-账户信息
	 */
	private static final String ADDENTITYACCOUNT_SQL = "addEntityAccount";
	/**
	 * 获取所有实体-账户信息
	 */
	private static final String GETALLENTITYACCOUNT_SQL = "getAllEntityAccount";
	/**
	 * 根据id获取实体-账户信息
	 */
	private static final String GETENTITYACCOUNTBYID_SQL = "getEntityAccountById";
	/**
	 * 根据id删除实体-账户信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新实体-账户信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addEntityAccount(EntityAccount entityAccount) {
		baseDao.insert(ADDENTITYACCOUNT_SQL, entityAccount);
	}

	@Override
	public List<EntityAccount> getAllEntityAccount() {
		return baseDao.selectList(GETALLENTITYACCOUNT_SQL);
	}

	@Override
	public EntityAccount getEntityAccountById(String id) {
		return baseDao.selectOne(GETENTITYACCOUNTBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(EntityAccount entityAccount) {
		baseDao.update(UPDATE_SQL, entityAccount);
	}

}
