/**
 * 
 */
package com.energy.weixin.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IApprovalDao;
import com.energy.weixin.entity.Approval;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service
public class ApprovalDaoImpl implements IApprovalDao {

	@Autowired
	private BaseDao baseDao;

	/**
	 * 添加审批信息
	 */
	private static final String ADDAPPROVAL_SQL = "addApproval";
	/**
	 * 获取所有审批信息
	 */
	private static final String GETALLAPPROVAL_SQL = "getAllApproval";
	/**
	 * 根据id获取审批信息
	 */
	private static final String GETABSENTBYID_SQL = "getAbsentById";
	/**
	 * 根据id删除审批信息
	 */
	private static final String DELETEBYID_SQL = "deleteById";
	/**
	 * 更新审批信息
	 */
	private static final String UPDATE_SQL = "update";

	@Override
	public void addApproval(Approval approval) {
		baseDao.insert(ADDAPPROVAL_SQL, approval);

	}

	@Override
	public List<Approval> getAllApproval() {
		return baseDao.selectList(GETALLAPPROVAL_SQL);
	}

	@Override
	public Approval getApprovalById(String id) {
		return baseDao.selectOne(GETABSENTBYID_SQL, id);
	}

	@Override
	public void deleteById(String id) {
		baseDao.delete(DELETEBYID_SQL, id);
	}

	@Override
	public void update(Approval approval) {
		baseDao.update(UPDATE_SQL, approval);
	}

}
