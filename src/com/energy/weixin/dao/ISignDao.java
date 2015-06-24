package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Sign;

public interface ISignDao {

	public void addSign(Sign sign);

	public List<Sign> signsToday();

	public Sign getSignById(String id);

	public void deleteById(String id);

	public void update(Sign sign);
	
}
