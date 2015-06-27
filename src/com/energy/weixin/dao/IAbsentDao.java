package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Absent;
import com.energy.weixin.model.PageQueryParameter;

/**
 * 请假
 * 
 * @author tf
 * 
 *         2015年6月24日
 */
public interface IAbsentDao {

	/**
	 * 添加请假信息
	 * 
	 * @param absent
	 */
	public void addAbsent(Absent absent);

	/**
	 * 获取所有请假信息
	 * 
	 * @return
	 */
	public List<Absent> getAllAbsent();

	/**
	 * 根据id获取请假信息
	 * 
	 * @param id
	 * @return
	 */
	public Absent getAbsentById(String id);

	/**
	 * 根据id删除请假信息
	 * 
	 * @param id
	 */
	public void deleteById(String id);

	/**
	 * 更新请假信息
	 * 
	 * @param absent
	 */
	public void update(Absent absent);

	/**
	 * 查询记录数
	 * 
	 * @param pageQueryParameter
	 * @return
	 */
	public long queryCount(PageQueryParameter pageQueryParameter);

	/**
	 * 分页查询
	 * 
	 * @param pageQueryParameter
	 * @return
	 */
	public List<Absent> queryAbsent(PageQueryParameter pageQueryParameter);

}
