package com.shopping.service;

import java.util.List;

import com.shopping.entity.UserMaster;
import com.shopping.model.UserRequest;

public interface UserServiceInterface<Users> {
	public void addUser();

	public com.shopping.entity.UserMaster findByUserID(int i);

	public List<com.shopping.entity.UserMaster> findByCountry(String s);

	public Iterable<UserMaster> getAllUsers();

	public com.shopping.entity.UserMaster updateUser(int id); // basic method

	UserMaster createUser(UserRequest userRequest);

	public com.shopping.entity.UserMaster deleteUser(int id);

	public UserMaster getByUserName(String userName);

}
