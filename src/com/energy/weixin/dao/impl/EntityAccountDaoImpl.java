package com.energy.weixin.dao.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityAccountDao;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.entity.PageQueryParameter;

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
	 * 添加实体-账户信息批量
	 */
	private static final String ADDENTITY_ACCOUNTBATCH_SQL = "addEntity_AccountBatch";
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

	/**
	 * 分页查询
	 */
	private static final String QUERYENTITYACCOUNTBYPAGE_SQL = "queryEntityAccountByPage";
	/**
	 * 查询记录数
	 */
	private static final String QUERYENTITYACCOUNTCOUNT_SQL = "queryEntityAccountCount";

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

	@Override
	public void addEntityAccount(EntityAccount... entityAccount) {
		List<EntityAccount> entityAccountList = new ArrayList<EntityAccount>();
		entityAccountList.addAll(Arrays.asList(entityAccount));
		baseDao.insert(ADDENTITY_ACCOUNTBATCH_SQL, entityAccountList);
	}

	@Override
	public long queryCount(PageQueryParameter pageQueryParameter) {
		return baseDao.selectOne(QUERYENTITYACCOUNTCOUNT_SQL, pageQueryParameter);
	}

	@Override
	public List<EntityAccount> queryEntityAccount(PageQueryParameter pageQueryParameter) {
		return baseDao.selectList(QUERYENTITYACCOUNTBYPAGE_SQL, pageQueryParameter);
	}

}
