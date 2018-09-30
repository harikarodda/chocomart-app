package com.shopping.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.entity.Roles;
import com.shopping.repository.RolesRepository;

@Service
@Transactional
public class RoleService  implements RoleServiceInterface<Roles> {
	
	@Autowired
	RolesRepository roleRepo;
	
	
	@Override
	public List<Roles> createRole() {
		// TODO Auto-generated method stub
		Roles r1= new Roles();
		
		r1.setUpdatedBy("Akirah");
		r1.setUpdatedTime("11:30");
		r1.setRoleName("Admin");
		r1.setRoleStatus("Active");
		r1.setAuthoroziedBy("Harika");
		r1.setAuthorizedTime("10:30AM");
		
	Roles r2= new Roles();
	r2.setUpdatedBy("Akirah");
	r2.setUpdatedTime("11:30");
	r2.setRoleName("User");
	r2.setRoleStatus("Active");
	r2.setAuthoroziedBy("Harika");
	r2.setAuthorizedTime("10:30AM");
 		
	Roles r3= new Roles();
	r3.setUpdatedBy("Akirah");
	r3.setUpdatedTime("11:30");
	r3.setRoleName("Guest");
	r3.setRoleStatus("Active");
	r3.setAuthoroziedBy("Harika");
	r3.setAuthorizedTime("10:30AM"); 
	
	Roles r4= new Roles();
	r4.setUpdatedBy("Akirah");
	r4.setUpdatedTime("11:30");
	r4.setRoleName("Accountant");
	r4.setRoleStatus("Active");
	r4.setAuthoroziedBy("Harika");
	r4.setAuthorizedTime("10:30AM");
		
		List<Roles> rl= new ArrayList<>();
		rl.add(r1);
		rl.add(r2);
		rl.add(r3);
		rl.add(r4);
		return rl;
	}

}
