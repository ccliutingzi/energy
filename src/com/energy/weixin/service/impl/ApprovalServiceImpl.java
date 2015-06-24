/**
 * 
 */
package com.energy.weixin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.energy.weixin.dao.IApprovalDao;
import com.energy.weixin.entity.Approval;
import com.energy.weixin.service.IApprovalService;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
@Service("approvalService")
public class ApprovalServiceImpl implements IApprovalService {

	@Autowired
	private IApprovalDao approvalDao;

	@Override
	public void addApproval(Approval approval) {
		approvalDao.addApproval(approval);
	}

	@Override
	public List<Approval> getAllApproval() {
		return approvalDao.getAllApproval();
	}

	@Override
	public Approval getApprovalById(String id) {
		return approvalDao.getApprovalById(id);
	}

	@Override
	public void deleteById(String id) {
		approvalDao.deleteById(id);
	}

	@Override
	public void update(Approval approval) {
		approvalDao.update(approval);
	}

}
