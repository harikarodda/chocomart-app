package com.shopping.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.constants.ChocomartConstants;
import com.shopping.entity.UserMaster;
import com.shopping.model.UserRequest;
import com.shopping.repository.UsersRepository;
import com.shopping.util.ChocomartUtility;

@Service
@Transactional
public class UserService implements UserServiceInterface<UserMaster> {

	@Autowired
	UsersRepository userRepo;

	@Override
	public UserMaster findByUserID(int i) {
		// TODO Auto-generated method stub
		UserMaster userFound = userRepo.findByUserId(i);
		return userFound;

	}

	
	@Override
	public List<UserMaster> findByCountry(String s) {
		List<UserMaster> userFoundByCountry = userRepo.findByCountry(s);
		// TODO Auto-generated method stub
		return userFoundByCountry;
	}

	@Override
	public UserMaster updateUser(int iDofUserToBeUpdated) {
		// TODO Auto-generated method stub
		UserMaster userToBeUpdated = userRepo.findByUserId(iDofUserToBeUpdated);
	//	userToBeUpdated.setUsername("UpdatedUserName");
		userRepo.save(userToBeUpdated);
		return userToBeUpdated;
	}

	@Override
	public UserMaster deleteUser(int idofUserToBeDeleted) {
		UserMaster userToBeDeleted = userRepo.findByUserId(idofUserToBeDeleted);
		userRepo.delete(userToBeDeleted);
		// userRepo.save(entity)
		return userToBeDeleted;
	}

	@Override
	public UserMaster createUser(UserRequest user) {
		UserMaster u1 = new UserMaster();
		u1.setUserName(user.getUserName());
		u1.setCountry(user.getCountry());
		u1.setPassword(user.getPassword());
		u1.setStatus(ChocomartConstants.PENDING);
		u1.setUpdatedBy("Harika");
		u1.setUpdatedTime(ChocomartUtility.getCurrentDate());
		System.out.println("saving object of"+u1.getUserName());
		return userRepo.save(u1);

	}

	@Override
	public Iterable<UserMaster> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub

	}


	@Override
	public UserMaster getByUserName(String userName) {
		return userRepo.findByUserName(userName);
	}

}// end of class
