package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.web.model.DataResult;

public interface IEntityAccountService {

	public void addEntityAccount(EntityAccount entityAccount);

	public List<EntityAccount> getAllEntityAccount();

	public EntityAccount getEntityAccountById(String id);

	public void deleteById(String id);

	public void update(EntityAccount entityAccount);

	/**
	 * 分页查询
	 * 
	 * @param absent
	 * @param pageIndex
	 * @param pageSize
	 */
	public DataResult<EntityAccount> queryEntityAccountRecord(EntityAccount entityAccount, int pageIndex, int pageSize);

	/**
	 * 添加实体信息
	 * @param entityAccount
	 */
	public void addEntityAccount(EntityAccount... entityAccount);
}
