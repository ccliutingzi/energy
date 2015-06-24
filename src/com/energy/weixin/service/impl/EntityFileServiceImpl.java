/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityFileDao;
import com.energy.weixin.entity.EntityFile;
import com.energy.weixin.service.IEntityFileService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("entityFileService")
public class EntityFileServiceImpl implements IEntityFileService {

	@Autowired
	private IEntityFileDao entityFileDao;

	@Override
	public void addEntityFile(EntityFile entityFile) {
		entityFileDao.addEntityFile(entityFile);
	}

	@Override
	public List<EntityFile> getAllEntityFile() {
		return entityFileDao.getAllEntityFile();
	}

	@Override
	public EntityFile getEntityFileById(String id) {
		return entityFileDao.getEntityFileById(id);
	}

	@Override
	public void deleteById(String id) {
		entityFileDao.deleteById(id);
	}

	@Override
	public void update(EntityFile entityFile) {
		entityFileDao.update(entityFile);
	}

}
