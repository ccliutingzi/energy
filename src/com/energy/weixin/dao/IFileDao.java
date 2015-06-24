package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.File;

public interface IFileDao {

	public void addFile(File file);

	public List<File> getAllFile();

	public File getFileById(String id);

	public void deleteById(String id);

	public void update(File file);

}
