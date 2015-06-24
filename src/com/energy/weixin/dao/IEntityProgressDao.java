package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.EntityProgress;

public interface IEntityProgressDao {

	public void addEntity_Progress(EntityProgress entityProgress);

	public List<EntityProgress> getAllEntity_Progress();

	public EntityProgress getEntityProgressById(String id);

	public void deleteById(String id);

	public void update(EntityProgress entityProgress);

}
