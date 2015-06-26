/**
 * 
 */
package com.energy.weixin.service;

import java.util.List;
import com.energy.weixin.entity.Absent;
import com.energy.weixin.web.model.DataResult;

/**
 * 请假服务类
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
public interface IAbsentService {

	/**
	 * 请假服务
	 * 
	 * @param params
	 *            jsonAbsentApplyInfo json数据信息{absentInfo:'',auditor:'',cc:[]}
	 */
	public void doApply(String jsonAbsentApplyInfo);

	public void addAbsent(Absent absent);

	public List<Absent> getAllAbsent();

	public Absent getAbsentById(String id);

	public void deleteById(String id);

	public void update(Absent absent);

	/**
	 * 分页查询
	 * @param absent
	 * @param pageIndex
	 * @param pageSize
	 */
	public DataResult<Absent> queryAbsentRecord(Absent absent, int pageIndex, int pageSize);
}
