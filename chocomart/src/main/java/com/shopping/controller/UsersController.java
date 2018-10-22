package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.UserMaster;
import com.shopping.model.UserRequest;
import com.shopping.service.UserServiceInterface;

@RestController
public class UsersController {

	@Autowired
	private UserServiceInterface userService;
/**
 * method to create a user 
 * @param userRequest
 * @return
 */
	@RequestMapping(value = "/user", method = RequestMethod.POST,produces="application/json",consumes="application/json")
	public @ResponseBody UserMaster addUsers(@RequestBody UserRequest userRequest) {
		
		System.out.println("to add user" + userRequest.getUserName());
		UserMaster user = userService.createUser(userRequest);
		return user;

	}
	
/**
 * Get all users from database table
 * @return
 */
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	public Iterable getAllUsers() {
		Iterable userFound = userService.getAllUsers();
		System.out.println("Find user by ID");
		return userFound;
	}
/**
 * find user data using username in url as path variable
 * http://localhost:8080/getUser/harika
 * @param userName
 * @return
 */
	@RequestMapping(value = "/getUser/{userName}", method = RequestMethod.GET)
	public UserMaster getByUserName(@PathVariable(value = "userName") String userName) {
		UserMaster userFound = userService.getByUserName(userName);
		System.out.println("Find user by ID");
		return userFound;
	}
	@RequestMapping(value = "/findIndianUsers", method = RequestMethod.GET)
	public List<UserMaster> userFoundByCountry() {
		List<UserMaster> userFind = userService.findByCountry("India");
		System.out.println("Find all users in INDIA");
		return userFind;
	}

	@PostMapping(value = "/updateUser/{userId}")
	public UserMaster updateUser(@PathVariable(value = "userId") int userId) {
		// , @Valid @RequestBody Users user) {
		UserMaster updatedUser = userService.updateUser(2);
		System.out.println("Update a particular user form URL-check postman");
		return updatedUser;
	}

	@DeleteMapping(value = "/deleteUser/{userId}")
	public UserMaster deleteUser(@PathVariable(value = "userId") int userId) {
		UserMaster deleteUser = userService.deleteUser(6);
		System.out.println("Delete a particular user form URL");
		return deleteUser;
	}
}// end
