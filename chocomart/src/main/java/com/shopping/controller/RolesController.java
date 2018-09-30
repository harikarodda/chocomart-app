package com.shopping.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(value="/insertRoles", method = RequestMethod.GET)
	public List<Roles> viewRoles(){
		List<Roles> roleList = roleService.createRole();
			 
			return roleList; 
	} //to create entries with different roles
	
	
	public List<Roles> findByRoleName(){ //working
		return null;
		
	}//whatever value is entered in path, users with that role name must be displayed
	
}
