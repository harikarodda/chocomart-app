package com.shopping.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.shopping.entity.Chocolates;
import com.shopping.entity.Transactions;

public interface TransactionRepository extends CrudRepository<Transactions, Integer>  {
	List<Transactions> findAll();
	
	List<Transactions> findByTransactionStatus(String s);
	
	
	
	
	
	
	
}
