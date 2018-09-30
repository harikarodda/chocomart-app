package com.shopping.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Users;
import com.shopping.service.UserServiceInterface;

@RestController
public class UsersController {

	@Autowired // child class- not suggested or interface- good way
	private UserServiceInterface userService;

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<Map<String, String>> addUsers() {

		List<Users> userList = userService.createUser();
		List<Map<String, String>> listMap = new ArrayList<>();

		for (Users a : userList) {
			Map<String, String> userMap = new HashMap<>();
			userMap.put(a.getUpdated_by(), a.getUsername());
			listMap.add(userMap);
		}
		System.out.println("Find user by ID and return username, updatedBy");
		return listMap;
		
	}

	@RequestMapping(value = "/findUser", method = RequestMethod.GET)
	public Users userFinding() {
		Users userFound = userService.findByUserID(1);
		System.out.println("Find user by ID");
		return userFound;
	}

	@RequestMapping(value = "/findIndianUsers", method = RequestMethod.GET)
	public List<Users> userFoundByCountry() {
		List<Users> userFind = userService.findByCountry("India");
		System.out.println("Find all users in INDIA");
		return userFind;
	}

		
	@PostMapping(value="/updateUser/{userId}")
    public Users updateUser(@PathVariable(value = "userId")int userId) {
    		//,    		@Valid @RequestBody Users user)	{
	  Users updatedUser = userService.updateUser(2);
		System.out.println("Update a particular user form URL-check postman");
		return updatedUser;
	}
    
	
	@DeleteMapping(value="/deleteUser/{userId}") 
	public Users deleteUser(@PathVariable(value="userId")int userId) {
		Users deleteUser= userService.deleteUser(6);
		System.out.println("Delete a particular user form URL");
		return deleteUser;
	}
}//end
