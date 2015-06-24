package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Absent;

/**
 * 请假
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
public interface IAbsentDao {

	public void addAbsent(Absent absent);

	public List<Absent> getAllAbsent();

	public Absent getAbsentById(String id);

	public void deleteById(String id);

	public void update(Absent absent);

}
