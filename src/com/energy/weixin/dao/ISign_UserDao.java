package com.energy.weixin.dao;

import java.util.List;

import com.energy.weixin.entity.Sign_User;

public interface ISign_UserDao {

	public void addSign_User(Sign_User sign_User);

	public List<Sign_User> getAllSign_User();

	public Sign_User getSign_UserById(String id);

	public void deleteById(String id);

	public void update(Sign_User sign_User);

}
