package com.shopping.service;

import java.util.List;

import com.shopping.entity.Transactions;
import com.shopping.entity.UserMaster;
import com.shopping.model.TransactionRequest;

public interface TransactionServiceInterface<Transactions> {

		
	com.shopping.entity.Transactions createTransaction(TransactionRequest tranReq);
	
	public Iterable<Transactions> getAllTransactions();
	
	public com.shopping.entity.Transactions getByTransactionAmount(int amount);
	
	/*******************************OLD***********************************************/
	//List<Transactions> createTransactions();

	List<com.shopping.entity.Transactions> updateTransactions();
}
