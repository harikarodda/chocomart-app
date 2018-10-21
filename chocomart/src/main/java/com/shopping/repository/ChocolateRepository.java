package com.shopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shopping.entity.Chocolates;
import com.shopping.entity.Roles;

public interface ChocolateRepository extends CrudRepository<Chocolates, Integer> {

	List<Chocolates> findAll();

	Chocolates findByChocolateName(String string);  
}
