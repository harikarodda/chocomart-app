package com.shopping.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Roles;
import com.shopping.service.RoleServiceInterface;

 

@RestController
public class RolesController {

	@Autowired
	private RoleServiceInterface<Roles> roleService;
	
	//@RequestMapping(value="/insertRoles", method = RequestMethod.GET)
	/*public List<Map<Integer, String>> viewRoles(){
		List<Roles> roleList = roleService.createRole();
	//		List<Map<Integer, String>> rMap= new ArrayList<>();
	//		
	//		for(Roles r : roleList) {
	//			Map<Integer, String> roleMap= new HashMap<>();
	//			//roleMap.put(r.getRoleId(), r.getRoleName());
	//			roleMap.put(r.getRoleId(), r.getRoleName());
	//			rMap.add(roleMap);
	//		}
	//		
	//		return rMap;
			return roleList; 
	} //to create entries with different roles
	*/
	
	@RequestMapping(value="/createRoles", method = RequestMethod.GET)
	public List<Roles> viewRoles(){
		List<Roles> roleList = roleService.createRole();
			 
			return roleList; 
	} //to create entries with different roles
	
	@RequestMapping(value="/listRoles", method = RequestMethod.GET)
	public  List<Roles> findAllRoles(){  
		List<Roles> allRoles = roleService.findAllRoles();
		System.out.println("list all the roles");
		return allRoles;
		
	}//whatever value is entered in path, users with that role name must be displayed
	
	
	//update role using findbyID
	
	@PostMapping(value="/updateRoleTime/{roleId}")
	public Roles updateRole(@PathVariable(value= "roleId") int roleId){
		Roles roleToBeUpdated = roleService.roleTimeUpdate(3);
		System.out.println("Update updatedTime of a particular role form URL-check postman");
		return roleToBeUpdated;
		 
	}
	
	@DeleteMapping(value="/deleteRole/{roleName}")  //pathparam not required here
	public List<Roles> deleteRoles(@PathVariable(value= "roleName") String roleName){
		List<Roles> roleToBeDeleted = roleService.deleteRole("Guest");
		System.out.println("Delete all guest roles form URL ");
		return roleToBeDeleted;
		
	}
	
	//doubts: how to delete all guest users??
	
}// end of class
