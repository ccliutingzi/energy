/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityAccountDao;
import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.service.IEntityAccountService;

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

}
