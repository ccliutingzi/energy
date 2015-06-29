package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Accessory;

public interface IAccessoryDao {

	public void addAccessory(Accessory accessory);

	public List<Accessory> getAllAccessory();

	public Accessory getAccessoryById(String id);

	public void deleteById(String id);

	public void update(Accessory accessory);

}
