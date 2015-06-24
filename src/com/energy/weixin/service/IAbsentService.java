/**
 * 
 */
package com.energy.weixin.service;

import java.util.List;

import com.energy.weixin.entity.Absent;

/**
 * 请假服务类
 * @author tf
 *
 * 2015年6月24日
 */
public interface IAbsentService {

	public void addAbsent(Absent absent);

	public List<Absent> getAllAbsent();

	public Absent getAbsentById(String id);

	public void deleteById(String id);

	public void update(Absent absent);
}
