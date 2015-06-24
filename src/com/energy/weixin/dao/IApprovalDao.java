package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Approval;

public interface IApprovalDao {

	public void addApproval(Approval approval);

	public List<Approval> getAllApproval();

	public Approval getApprovalById(String id);

	public void deleteById(String id);

	public void update(Approval approval);

}
