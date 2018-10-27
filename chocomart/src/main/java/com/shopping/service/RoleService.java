package com.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.entity.Roles;
import com.shopping.entity.UserMaster;
import com.shopping.model.RoleRequest;
import com.shopping.repository.RolesRepository;
import com.shopping.util.ChocomartUtility;

@Service
@Transactional
public class RoleService  implements RoleServiceInterface<Roles> {
	
	@Autowired
	RolesRepository roleRepo;
	
	
	/*@Override
	public List<Roles> createRole() {
		// TODO Auto-generated method stub
		Roles r1= new Roles();
		
		r1.setUpdatedBy("Akirah");
		r1.setUpdatedTime("11:30");
		r1.setRoleName("Admin");
		r1.setRoleStatus("Active");
		r1.setAuthoroziedBy("Harika");
		r1.setAuthorizedTime("10:30AM");
		Roles role1=roleRepo.save(r1);
		
	Roles r2= new Roles();
	r2.setUpdatedBy("Akirah");
	r2.setUpdatedTime("11:30");
	r2.setRoleName("User");
	r2.setRoleStatus("Active");
	r2.setAuthoroziedBy("Harika");
	r2.setAuthorizedTime("10:30AM");
	Roles role2=roleRepo.save(r2);
	
	Roles r3= new Roles();
	r3.setUpdatedBy("Akirah");
	r3.setUpdatedTime("11:30");
	r3.setRoleName("Guest");
	r3.setRoleStatus("Active");
	r3.setAuthoroziedBy("Harika");
	r3.setAuthorizedTime("10:30AM"); 
	Roles role3=roleRepo.save(r3);
	
	Roles r4= new Roles();
	r4.setUpdatedBy("Akirah");
	r4.setUpdatedTime("11:30");
	r4.setRoleName("Accountant");
	r4.setRoleStatus("Active");
	r4.setAuthoroziedBy("Harika");
	r4.setAuthorizedTime("10:30AM");
	Roles role4=roleRepo.save(r4);	
		List<Roles> rl= new ArrayList<>();
		rl.add(r1);
		rl.add(r2);
		rl.add(r3);
		rl.add(r4);
		return rl;
	}*/
	
	@Override  //1
	public Roles createRole(RoleRequest role) {  //passing json object converted from http requestbody
		Roles r1= new Roles();
		r1.setRoleName(role.getRoleName());
		r1.setUpdatedBy(role.getRoleUpdatedBy());
		r1.setAuthoroziedBy(role.getRoleAuthorizedBy()); //these 3 will be returned from http body
		r1.setAuthorizedTime(ChocomartUtility.getCurrentDate());
		r1.setUpdatedTime(ChocomartUtility.getCurrentDate());
		System.out.println("saving object of"+r1.getRoleName());
		return roleRepo.save(r1);
	}
	
	@Override   //2
	public Iterable<Roles> getAllRoles() {
		// TODO Auto-generated method stub
		return roleRepo.findAll();
	}
	
	@Override //3
	public Roles getByRoleName(String roleName) {
		// TODO Auto-generated method stub
		return roleRepo.findByRoleName(roleName);
	}

	@Override
	public List<Roles> findAllRoles() {
		// TODO Auto-generated method stub
		List<Roles> allRoles = (List<Roles>) roleRepo.findAll();
				return allRoles;
	}


	@Override
	public Roles roleTimeUpdate(int iDofRoleToBeUpdated) {
		// TODO Auto-generated method stub
		 Roles updatingRole = roleRepo.findByRoleId(iDofRoleToBeUpdated);
		 updatingRole.setAuthoroziedBy("Vassu");
		 roleRepo.save(updatingRole);
		return updatingRole;
	}

	@Override
	public List<Roles> deleteRole(String roleName) {
		// TODO Auto-generated method stub
		return null;
	}


//	@Override
//	public List<Roles> deleteRole(String s) {
//		// TODO Auto-generated method stub
//		List<Roles> deletedRole= roleRepo.findByRoleName("Guest");
//		//roleRepo.saveAll(deletedRole);
//		roleRepo.deleteAll(deletedRole);
//		return deletedRole;
//	}

	


	

	
	 

}
