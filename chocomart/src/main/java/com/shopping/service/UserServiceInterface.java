package com.shopping.service;

import java.util.List;

public interface UserServiceInterface<Users> {
	public void addUser();
	//public Users createUser(Users user);
	//public Users findUserByUserNmae(String s);
	public com.shopping.entity.Users findByUserID(int i);
	public List<com.shopping.entity.Users> findByCountry(String s);
	public Iterable<com.shopping.entity.Users> getAllUsers();
	
	
	
	//com.shopping.entity.Users createUser(com.shopping.entity.Users user);
	
	public com.shopping.entity.Users updateUser(int id); //basic method
	  List<Users> createUser();
	public com.shopping.entity.Users deleteUser(int id);
	
	 
}
