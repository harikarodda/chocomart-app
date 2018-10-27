package com.shopping.model;

import org.springframework.stereotype.Component;

@Component
public class TransactionRequest {
	
	int transactionAmount;
	
	String transactionBy;
	
	String transactionDate;
	
	public int gettransactionAmount() {
		return transactionAmount;
	}

	public void settransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String gettransactionBy() {
		return transactionBy;
	}

	public void settransactionBy(String transactionBy) {
		transactionBy = transactionBy;
	}

	public String gettransactionDate() {
		return transactionDate;
	}

	public void settransactionDate(String transactionDate) {
		transactionDate = transactionDate;
	}

	

	
	
}
