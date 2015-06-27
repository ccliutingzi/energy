package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.EntityAccount;
import com.energy.weixin.model.PageQueryParameter;

public interface IEntityAccountDao {

	public void addEntityAccount(EntityAccount... entityAccount);

	public void addEntityAccount(EntityAccount entityAccount);

	public List<EntityAccount> getAllEntityAccount();

	public EntityAccount getEntityAccountById(String id);

	public void deleteById(String id);

	public void update(EntityAccount entityAccount);

	/**
	 * 查询记录数
	 * 
	 * @param pageQueryParameter
	 * @return
	 */
	public long queryCount(PageQueryParameter pageQueryParameter);

	/**
	 * 分页查询
	 * 
	 * @param pageQueryParameter
	 * @return
	 */
	public List<EntityAccount> queryEntityAccount(PageQueryParameter pageQueryParameter);
}
