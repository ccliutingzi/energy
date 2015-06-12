package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Entity_File;

public interface Entity_FileMapper {

	public void addEntity_File(Entity_File entity_File);

	public List<Entity_File> getAllEntity_File();

	public Entity_File getEntity_FileById(String id);

	public void deleteById(String id);

	public void update(Entity_File entity_File);

}
