/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.apache.commons.fileupload.FileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IFileDao;
import com.energy.weixin.entity.File;
import com.energy.weixin.service.IFileService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("fileService")
public class FileServiceImpl implements IFileService {

	@Autowired
	private IFileDao fileDao;

	@Override
	public void addFile(File file) {
		fileDao.addFile(file);
	}

	@Override
	public List<File> getAllFile() {
		return fileDao.getAllFile();
	}

	@Override
	public File getFileById(String id) {
		return fileDao.getFileById(id);
	}

	@Override
	public void deleteById(String id) {
		fileDao.deleteById(id);
	}

	@Override
	public void update(File file) {
		fileDao.update(file);
	}

	@Override
	public void addFile(List<FileItem> fileltems) {
		//fileltems.get(0).g
	}

}
