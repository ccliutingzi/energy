package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.EntityProgress;

public interface IEntityProgressService {

	public void addEntity_Progress(EntityProgress entityProgress);

	public List<EntityProgress> getAllEntityProgress();

	public EntityProgress getEntityProgressById(String id);

	public void deleteById(String id);

	public void update(EntityProgress entityProgress);

}
