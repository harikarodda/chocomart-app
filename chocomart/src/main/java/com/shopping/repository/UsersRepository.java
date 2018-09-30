package com.shopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shopping.entity.Users;

public interface UsersRepository extends CrudRepository<Users, Integer> {

	Users findByUserId(int userId);

	List<Users> findByCountry(String country);

	//Users updateUser(int userId);

}
