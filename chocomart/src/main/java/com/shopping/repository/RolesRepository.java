package com.shopping.repository;

import org.springframework.data.repository.CrudRepository;

import com.shopping.entity.Roles;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
	
 Roles findByRoleId(int roleId);
	
}
