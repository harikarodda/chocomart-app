package com.shopping.service;

import java.util.List;

import com.shopping.entity.UserMaster;
import com.shopping.model.UserRequest;

public interface UserServiceInterface<Users> {
	UserMaster createUser(UserRequest userRequest);
	public Iterable<UserMaster> getAllUsers();
	public UserMaster getByUserName(String userName);
	
	//**************OLD************************************//
	
	public void addUser();

	public com.shopping.entity.UserMaster findByUserID(int i);

	public List<com.shopping.entity.UserMaster> findByCountry(String s);

	

	public com.shopping.entity.UserMaster updateUser(int id); // basic method

	

	public com.shopping.entity.UserMaster deleteUser(int id);

	

}
