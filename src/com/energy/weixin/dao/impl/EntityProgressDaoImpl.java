package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IEntityProgressDao;
import com.energy.weixin.entity.EntityProgress;

/**
 * 实体-进展DAO
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class EntityProgressDaoImpl implements IEntityProgressDao {
	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加实体-进展信息
	 */
	private static final String ADDENTITYPROGRESS_SQL = "addEntityProgress";
	/**
	 * 获取所有实体-进展信息
	 */
	private static final String GETALLENTITYPROGRESS_SQL = "getAllEntityProgress";
	/**
	 * 根据id获取实体-进展信息
	 */
	private static final String GETENTITYPROGRESSBYID_SQL = "getEntityProgressById";
	/**
	 * 根据id删除实体-进展信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新实体-进展信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addEntityProgress(EntityProgress entityProgress) {
		baseDao.insert(ADDENTITYPROGRESS_SQL, entityProgress);
	}

	@Override
	public List<EntityProgress> getAllEntity_Progress() {
		return baseDao.selectList(GETALLENTITYPROGRESS_SQL);
	}

	@Override
	public EntityProgress getEntityProgressById(String id) {
		return baseDao.selectOne(GETENTITYPROGRESSBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(EntityProgress entityProgress) {
		baseDao.update(UPDATE_SQL, entityProgress);
	}

}
