package com.shopping.service;

import java.util.List;

public interface RoleServiceInterface<Roles> {

 List<Roles> createRole();

List<com.shopping.entity.Roles> findAllRoles();

Roles roleTimeUpdate(int i);

List<Roles> deleteRole(String roleName);

//List<Roles> findByRoleName(String string);


	
	
	
}
