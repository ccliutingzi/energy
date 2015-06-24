package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Entity_Progress;

public interface IEntity_ProgressDao {

	public void addEntity_Progress(Entity_Progress entity_Progress);

	public List<Entity_Progress> getAllEntity_Progress();

	public Entity_Progress getEntity_ProgressById(String id);

	public void deleteById(String id);

	public void update(Entity_Progress entity_Progress);

}
