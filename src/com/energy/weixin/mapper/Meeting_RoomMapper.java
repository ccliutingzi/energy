package com.energy.weixin.mapper;

import java.util.List;

import com.energy.weixin.entity.User;

public interface Meeting_RoomMapper {

	public void addUser(User user);

	public List<User> getAllUser();

	public User getUserById(String id);

	public void deleteById(String id);

	public void update(User user);

}
