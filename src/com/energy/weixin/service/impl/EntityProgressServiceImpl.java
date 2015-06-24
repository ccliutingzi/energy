/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityProgressDao;
import com.energy.weixin.entity.EntityProgress;
import com.energy.weixin.service.IEntityProgressService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("entityProgressService")
public class EntityProgressServiceImpl implements IEntityProgressService {

	@Autowired
	private IEntityProgressDao entityProgressDao;

	@Override
	public void addEntity_Progress(EntityProgress entityProgress) {
		entityProgressDao.addEntityProgress(entityProgress);
	}

	@Override
	public List<EntityProgress> getAllEntityProgress() {
		return entityProgressDao.getAllEntity_Progress();
	}

	@Override
	public EntityProgress getEntityProgressById(String id) {
		return entityProgressDao.getEntityProgressById(id);
	}

	@Override
	public void deleteById(String id) {
		entityProgressDao.deleteById(id);
	}

	@Override
	public void update(EntityProgress entityProgress) {
		entityProgressDao.update(entityProgress);

	}

}
