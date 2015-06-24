package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.EntityProgress;

public interface IEntityProgressService {

	public void addEntity_Progress(EntityProgress entity_Progress);

	public List<EntityProgress> getAllEntity_Progress();

	public EntityProgress getEntity_ProgressById(String id);

	public void deleteById(String id);

	public void update(EntityProgress entity_Progress);

}
