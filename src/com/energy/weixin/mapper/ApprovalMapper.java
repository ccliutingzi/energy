package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Approval;

public interface ApprovalMapper {

	public void addApproval(Approval approval);

	public List<Approval> getAllApproval();

	public Approval getApprovalById(String id);

	public void deleteById(String id);

	public void update(Approval approval);

}
