/**
 * 
 */
package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.Approval;

/**
 * @author tf
 * 
 *         2015年6月24日
 */
public interface IApprovalService {
	public void addApproval(Approval approval);

	public List<Approval> getAllApproval();

	public Approval getApprovalById(String id);

	public void deleteById(String id);

	public void update(Approval approval);
}
