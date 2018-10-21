package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Transactions;
import com.shopping.service.TransactionServiceInterface;

@RestController
public class TransactionController {
	
	@Autowired
	private TransactionServiceInterface tranService;
	
	@RequestMapping(value="/createTransactions", method= RequestMethod.GET)
	public List<Transactions> listTransactions(){
		List<Transactions> tranList = tranService.createTransactions();
		System.out.println("Calls service method to create some transactions"); 
		return tranList;
	}
	
	@PostMapping(value="/updatePendingTransactions")
	public List<Transactions> updateTransactions(){
		List<Transactions> listTran = tranService.updateTransactions();
		System.out.println("COnverts all the processing events to Completed");
		return listTran;
		
	}
}//end of controller class 
