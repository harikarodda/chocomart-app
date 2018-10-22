package com.shopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shopping.entity.UserMaster;

public interface UsersRepository extends CrudRepository<UserMaster, Integer> {

	UserMaster findByUserId(int userId);

	List<UserMaster> findByCountry(String country);

	UserMaster findByUserName(String userName);

	//Users updateUser(int userId);

}
