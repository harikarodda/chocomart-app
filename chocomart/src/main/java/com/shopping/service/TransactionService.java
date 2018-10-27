package com.shopping.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Transactions;
import com.shopping.model.TransactionRequest;
import com.shopping.repository.TransactionRepository;

@Service
@Transactional
public class TransactionService implements TransactionServiceInterface<Transactions> {

	@Autowired
	TransactionRepository tranRepo;

	@Override
	public Transactions createTransaction(TransactionRequest transaction) {
		// TODO Auto-generated method stub
		Transactions t1= new Transactions();
		 t1.setTransactionAmount(transaction.gettransactionAmount());
		 t1.setTransactionDate(transaction.gettransactionDate());
		 t1.setTransactionBy(transaction.gettransactionBy());
		//the above 3 will be obtained by the json data
		t1.setTransactionPromo("DEFAULT");
		t1.setTransactionStatus("Processing");
		System.out.println("Saving Object of " + t1.getTransactionID());
		
		return tranRepo.save(t1);
	}
	
	@Override
	public Iterable<Transactions> getAllTransactions() {
		// TODO Auto-generated method stub
		return tranRepo.findAll();
	}

	@Override
	public Transactions getByTransactionAmount(int amount ) {
		// TODO Auto-generated method stub
		return tranRepo.findByTransactionAmount(amount);
	}
	
	
	
	
	
	/****************************************OLD********************************************************/
	/*@Override         //old method of creating transactions
	public List<Transactions> createTransactions() {
		// TODO Auto-generated method stub
		Transactions t1= new Transactions();
		t1.setTransactionAmount(100);
		t1.setTransactionStatus("Declined");
		t1.setTransactionPromo("PROMO25");
		
		//TO SET DATE with current date 
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		String date = simpleDateFormat.format(new Date());
		System.out.println(date);
		
		t1.setTransactionDate(date); //TO SET DATE with current date
		t1.setTransactionBy("harika");
		
		Transactions trans1= tranRepo.save(t1);//save the entry
		
		
		
		//other list item
		Transactions t2= new Transactions();
		t2.setTransactionAmount(1000);
		t2.setTransactionStatus("Approved");
		t2.setTransactionPromo("PROMO25");
		
		//TO SET DATE with current date 
		String date2 = simpleDateFormat.format(new Date()); //refer t1 
		System.out.println(date2);
		
		t2.setTransactionDate(date2); //TO SET DATE with current date
		t2.setTransactionBy("harika");
		Transactions trans2= tranRepo.save(t2);
		
		//new entry
		Transactions t3= new Transactions();
		t3.setTransactionAmount(10000);
		t3.setTransactionStatus("Processing");
		t3.setTransactionPromo("PROMO55");
		
		//TO SET DATE with current date 
		String date3 = simpleDateFormat.format(new Date()); //refer t1 
		System.out.println(date3);
		
		t3.setTransactionDate(date3); //TO SET DATE with current date
		t3.setTransactionBy("akirah");
		Transactions trans3= tranRepo.save(t3);
		
		//////
		Transactions t4= new Transactions();
		t4.setTransactionAmount(10000);
		t4.setTransactionStatus("Processing");
		t4.setTransactionPromo("PROMO55");
		
		//TO SET DATE with current date 
		String date4 = simpleDateFormat.format(new Date()); //refer t1 
		System.out.println(date3);
		
		t4.setTransactionDate(date3); //TO SET DATE with current date
		t4.setTransactionBy("akirah");
		Transactions trans4= tranRepo.save(t4);
		/////
		
		//add all entries to a list
		List<Transactions> tranList = new ArrayList<>();
		tranList.add(trans1);
		tranList.add(trans2);
		tranList.add(trans3);
		tranList.add(trans4);
		return tranList;
	}
*/
	@Override
	public List<Transactions> updateTransactions() {
		// TODO Auto-generated method stub
		List<Transactions> updateTransactions = (List<Transactions>) tranRepo.findByTransactionStatus("Processing");
		 for(Transactions t: updateTransactions) {
			 t.setTransactionStatus("Transaction will be completed in 24 hrs");
		 }
		 tranRepo.saveAll(updateTransactions);
		return updateTransactions;
	}

	

	
	
	
	
}
