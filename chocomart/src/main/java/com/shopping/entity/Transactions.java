package com.shopping.entity;


import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Transaction_Master")
public class Transactions {
	@Id
	@GeneratedValue(strategy=  GenerationType.AUTO)
	@Column(name="Transaction_ID")
	int transactionID;
	
	@Column(name="Transaction_Amount")
	int transactionAmount;
	
	@Column(name="Transaction_Promo")
	String transactionPromo;
	
	@Column(name="Transaction_Status")
	String transactionStatus;
	
	@Column(name="Transaction_By")
	String TransactionBy;
	
	@Column(name="Transaction_DateTime")
	String TransactionDate;
	
	public int getTransactionID() {
		return transactionID;
	}

	public void setTransactionID(int transactionID) {
		this.transactionID = transactionID;
	}

	public int getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(int transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionPromo() {
		return transactionPromo;
	}

	public void setTransactionPromo(String transactionPromo) {
		this.transactionPromo = transactionPromo;
	}

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionBy() {
		return TransactionBy;
	}

	public void setTransactionBy(String transactionBy) {
		TransactionBy = transactionBy;
	}

	public String getTransactionDate() {
		return TransactionDate;
	}

	public void setTransactionDate(String date) {
		TransactionDate = date;
	}
	
	public Transactions() {
		
	}

}
