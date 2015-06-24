package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityFileDao;
import com.energy.weixin.entity.EntityFile;

/**
 * 实体-文件DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class EntityFileDaoImpl implements IEntityFileDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加实体-文件信息
	 */
	private static final String ADDENTITYFILE_SQL = "addEntityFile";
	/**
	 * 获取所有实体-文件信息
	 */
	private static final String GETALLENTITYFILE_SQL = "getAllEntityFile";
	/**
	 * 根据id获取实体-文件信息
	 */
	private static final String GETENTITYFILEBYID_SQL = "getEntityFileById";
	/**
	 * 根据id删除实体-文件信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新实体-文件信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addEntityFile(EntityFile entityFile) {
		baseDao.insert(ADDENTITYFILE_SQL, entityFile);
	}

	@Override
	public List<EntityFile> getAllEntityFile() {
		return baseDao.selectList(GETALLENTITYFILE_SQL);
	}

	@Override
	public EntityFile getEntityFileById(String id) {
		return baseDao.selectOne(GETENTITYFILEBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(EntityFile entityFile) {
		baseDao.update(UPDATE_SQL, entityFile);
	}

}
