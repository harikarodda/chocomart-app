package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Transactions;
import com.shopping.model.TransactionRequest;
import com.shopping.service.TransactionServiceInterface;

@RestController
public class TransactionController {

	@Autowired
	private TransactionServiceInterface tranService;
	
	//1.
	@RequestMapping(value = "/transaction", method = RequestMethod.POST,produces="application/json",consumes="application/json")
	public @ResponseBody Transactions addTransactions(@RequestBody TransactionRequest tranReq) {
		
		System.out.println("To add a transaction"+tranReq.gettransactionBy());
		Transactions transactions= tranService.createTransaction(tranReq);
		return transactions;
		
	}
	
	//2.
	@RequestMapping(value = "/getAllTransactions", method = RequestMethod.GET)
	public Iterable getAllTransactions(){
		Iterable transactionFound= tranService.getAllTransactions();
		System.out.println("Find all Transactions");
		return transactionFound;
	
	}
	
	//3. The transaction done by the user will be displayed : http://localhost:8081/getTransaction/100
	@RequestMapping(value = "/getTransaction/{amount}", method = RequestMethod.GET)
	public Transactions getByTransactionBy(@PathVariable(value = "amount") int amount) {
	Transactions transactionFound = tranService.getByTransactionAmount(amount)	;
	return transactionFound;
	}
	
	
	
	
	
	/************************** OLD*****************************************/
	/*
	 * @RequestMapping(value="/createTransactions", method= RequestMethod.GET)
	 * public List<Transactions> listTransactions(){ List<Transactions> tranList =
	 * tranService.createTransactions();
	 * System.out.println("Calls service method to create some transactions");
	 * return tranList; }
	 */

	@PostMapping(value = "/updatePendingTransactions")
	public List<Transactions> updateTransactions() {
		List<Transactions> listTran = tranService.updateTransactions();
		System.out.println("COnverts all the processing events to Completed");
		return listTran;

	}
}// end of controller class
