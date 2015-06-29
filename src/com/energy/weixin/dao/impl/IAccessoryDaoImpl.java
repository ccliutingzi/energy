package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IAccessoryDao;
import com.energy.weixin.entity.Accessory;

/**
 * 文件信息DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class IAccessoryDaoImpl implements IAccessoryDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加文件信息
	 */
	private static final String ADDFILE_SQL = "addAccessory";
	/**
	 * 获取所有文件信息
	 */
	private static final String GETALLFILE_SQL = "getAllAccessory";
	/**
	 * 根据id获取文件信息
	 */
	private static final String GETFILEBYID_SQL = "getAccessoryById";
	/**
	 * 根据id删除文件信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新文件信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addAccessory(Accessory accessory) {
		baseDao.insert(ADDFILE_SQL, accessory);
	}

	@Override
	public List<Accessory> getAllAccessory() {
		return baseDao.selectList(GETALLFILE_SQL);
	}

	@Override
	public Accessory getAccessoryById(String id) {
		return baseDao.selectOne(GETFILEBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(Accessory accessory) {
		baseDao.update(UPDATE_SQL, accessory);
	}

}
