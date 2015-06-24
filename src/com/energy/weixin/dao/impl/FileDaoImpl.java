package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IFileDao;
import com.energy.weixin.entity.File;

/**
 * 文件信息DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class FileDaoImpl implements IFileDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加文件信息
	 */
	private static final String ADDFILE_SQL = "addFile";
	/**
	 * 获取所有文件信息
	 */
	private static final String GETALLFILE_SQL = "getAllFile";
	/**
	 * 根据id获取文件信息
	 */
	private static final String GETFILEBYID_SQL = "getFileById";
	/**
	 * 根据id删除文件信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新文件信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addFile(File file) {
		baseDao.insert(ADDFILE_SQL, file);
	}

	@Override
	public List<File> getAllFile() {
		return baseDao.selectList(GETALLFILE_SQL);
	}

	@Override
	public File getFileById(String id) {
		return baseDao.selectOne(GETFILEBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(File file) {
		baseDao.update(UPDATE_SQL, file);
	}

}
