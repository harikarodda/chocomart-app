package com.shopping.service;

import java.util.List;

import com.shopping.entity.Transactions;

public interface TransactionServiceInterface<Transactions> {

	List<Transactions> createTransactions();

	List<com.shopping.entity.Transactions> updateTransactions();

}
