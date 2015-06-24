package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.EntityAccount;

public interface IEntityAccountService {

	public void addEntityAccount(EntityAccount entityAccount);

	public List<EntityAccount> getAllEntityAccount();

	public EntityAccount getEntityAccountById(String id);

	public void deleteById(String id);

	public void update(EntityAccount entityAccount);

}
