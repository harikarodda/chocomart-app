package com.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Users;
import com.shopping.repository.UsersRepository;

@Service
@Transactional
public class UserService implements UserServiceInterface<Users>  {

	@Autowired
	UsersRepository userRepo;
	
	@Override
	public Users findByUserID(int i) {
		// TODO Auto-generated method stub
		Users userFound= userRepo.findByUserId(i);
		return userFound;
		 
	}
	
	@Override
	public List<Users> findByCountry(String s) {
		List<Users> userFoundByCountry = userRepo.findByCountry(s);
		// TODO Auto-generated method stub
		return userFoundByCountry;
	}

	@Override
	public Users updateUser(int iDofUserToBeUpdated) {
		// TODO Auto-generated method stub
		Users userToBeUpdated= userRepo.findByUserId(iDofUserToBeUpdated);
		userToBeUpdated.setUsername("UpdatedUserName");
		userRepo.save(userToBeUpdated);
		return userToBeUpdated;
	}

	
	@Override
	public Users deleteUser(int idofUserToBeDeleted) {
		Users userToBeDeleted= userRepo.findByUserId(idofUserToBeDeleted);
		userRepo.delete(userToBeDeleted);
		//userRepo.save(entity)
		return userToBeDeleted;
	}


	//trial
	@Override
	public List<Users> createUser() { //previously createUser(Users user)
		// TODO Auto-generated method stub
		Users u1= new Users();
		u1.setUsername("user1");
		u1.setPassword("pwd1");
		u1.setCountry("India");
		u1.setAuthorized_by("DP");
		u1.setAuthorizedTime("10:11 PM");
		u1.setUpdatedTime("19:10 AM");
		u1.setUpdated_by("Harika");
		u1.setLast_loginTime("10:13PM");
		Users user1= userRepo.save(u1);
		
		
		Users u2= new Users();
		u2.setUsername("user2");
		u2.setPassword("pwd2");
		u2.setCountry("India");
		u2.setAuthorized_by("DP");
		u2.setAuthorizedTime("10:11 PM");
		u2.setUpdatedTime("19:10 AM");
		u2.setUpdated_by("Harika");
		u2.setLast_loginTime("10:13PM");
		Users user2= userRepo.save(u2);
		
		
		Users u3= new Users();
		u3.setUsername("user3");
		u3.setPassword("pwd3");
		u3.setCountry("India");
		u3.setAuthorized_by("DP");
		u3.setAuthorizedTime("10:11 PM");
		u3.setUpdatedTime("19:10 AM");
		u3.setUpdated_by("Harika");
		u3.setLast_loginTime("10:13PM");
		Users user3= userRepo.save(u3);
		 
		 List<Users> ul = new ArrayList<>();
		 ul.add(user1);
		 ul.add(user2);
		 ul.add(user3);
		 return ul;
	}
	
	@Override
	public Iterable<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}
	
	

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}

	 

	 
}//end of class
