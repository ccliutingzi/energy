package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.Sign;

public interface SignMapper {

	public void addSign(Sign sign);

	public List<Sign> signsToday();

	public Sign getSignById(String id);

	public void deleteById(String id);

	public void update(Sign sign);
	
}
