package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.EntityFile;

public interface IEntityFileDao {

	public void addEntityFile(EntityFile entityFile);

	public List<EntityFile> getAllEntityFile();

	public EntityFile getEntityFileById(String id);

	public void deleteById(String id);

	public void update(EntityFile entityFile);

}
