package com.shopping.service;

import java.util.List;

import com.shopping.model.RoleRequest;

 

public interface RoleServiceInterface<Roles> {

 ///List<Roles> createRole();
	Roles createRole(RoleRequest roleReq);//1
	
	public Iterable<Roles> getAllRoles();//2
	
	public Roles getByRoleName(String roleName);//3
	
	

List<com.shopping.entity.Roles> findAllRoles();

Roles roleTimeUpdate(int i);

List<Roles> deleteRole(String roleName);

//List<Roles> findByRoleName(String string);


	
	
	
}
