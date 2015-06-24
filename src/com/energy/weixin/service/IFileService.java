package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.File;

public interface IFileService {

	public void addFile(File file);

	public List<File> getAllFile();

	public File getFileById(String id);

	public void deleteById(String id);

	public void update(File file);

}
