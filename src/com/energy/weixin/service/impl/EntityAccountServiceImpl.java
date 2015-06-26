/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityAccountDao;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.entity.PageQueryParameter;
import com.energy.weixin.service.IEntityAccountService;
import com.energy.weixin.web.model.DataResult;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("entityAccountService")
public class EntityAccountServiceImpl implements IEntityAccountService {

	@Autowired
	private IEntityAccountDao entityAccountDao;

	@Override
	public void addEntityAccount(EntityAccount entityAccount) {
		entityAccountDao.addEntityAccount(entityAccount);
	}

	@Override
	public List<EntityAccount> getAllEntityAccount() {
		return entityAccountDao.getAllEntityAccount();
	}

	@Override
	public EntityAccount getEntityAccountById(String id) {
		return entityAccountDao.getEntityAccountById(id);
	}

	@Override
	public void deleteById(String id) {
		entityAccountDao.deleteById(id);
	}

	@Override
	public void update(EntityAccount entityAccount) {
		entityAccountDao.update(entityAccount);
	}

	@Override
	public DataResult<EntityAccount> queryEntityAccountRecord(EntityAccount entityAccount, int pageIndex, int pageSize) {
		DataResult<EntityAccount> dataResult = new DataResult<EntityAccount>();
		PageQueryParameter pageQueryParameter = new PageQueryParameter();
		pageQueryParameter.setPageIndex(pageIndex);
		pageQueryParameter.setPageSize(pageSize);
		pageQueryParameter.setParameter(entityAccount);
		dataResult.setDataList(entityAccountDao.queryEntityAccount(pageQueryParameter));
		dataResult.setTotal((int) entityAccountDao.queryCount(pageQueryParameter));
		return dataResult;
	}

}
