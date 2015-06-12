package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Entity_Account;

public interface Entity_AccountMapper {

	public void addEntity_Account(Entity_Account entity_Account);

	public List<Entity_Account> getAllEntity_Account();

	public Entity_Account getEntity_AccountById(String id);

	public void deleteById(String id);

	public void update(Entity_Account entity_Account);

}
