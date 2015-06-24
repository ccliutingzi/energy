package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.EntityAccount;

public interface IEntityAccountDao {

	public void addEntity_Account(EntityAccount entityAccount);

	public List<EntityAccount> getAllEntityAccount();

	public EntityAccount getEntityAccountById(String id);

	public void deleteById(String id);

	public void update(EntityAccount entityAccount);

}
