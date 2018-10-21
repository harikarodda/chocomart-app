package com.shopping.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.entity.Chocolates;
import com.shopping.repository.ChocolateRepository;

@Service
@Transactional
public class ChocolateService implements ChocolateServiceInterface<Chocolates> {
	
	
	@Autowired
	ChocolateRepository chocoRepo;
	
	@Override
	public List<Chocolates> chocolateCreation() {
		// TODO Auto-generated method stub
		
		Chocolates c1= new Chocolates();
		 c1.setAuthorizedBy("Harika");
		 c1.setAuthorizedTime("01:00PM");
		 c1.setChocolateDescription("Caramel chocolate");
		 c1.setChocolateName("CreamCaramel");
		 c1.setQuantity(100);
		 c1.setUpdatedBy("harry");
		 c1.setUpdatedTime("8:45PM");
		 Chocolates choco1= chocoRepo.save(c1); //save chocolate to DB
		 
		 Chocolates c2= new Chocolates();
		 c2.setAuthorizedBy("Harika");
		 c2.setAuthorizedTime("01:00PM");
		 c2.setChocolateDescription(" Coffee Flavour");
		 c2.setChocolateName("CoffeBite");
		 c2.setQuantity(100);
		 c2.setUpdatedBy("harry");
		 c2.setUpdatedTime("8:45PM");
		 Chocolates choco2= chocoRepo.save(c2); //save chocolate to DB
		 
		 
		 Chocolates c3= new Chocolates();
		 c3.setAuthorizedBy("Harika");
		 c3.setAuthorizedTime("01:00PM");
		 c3.setChocolateDescription(" Mango falvour");
		 c3.setChocolateName("MangoBite");
		 c3.setQuantity(100);
		 c3.setUpdatedBy("harry");
		 c3.setUpdatedTime("8:45PM");
		 Chocolates choco3= chocoRepo.save(c3); //save chocolate to DB
		  
		 List<Chocolates> chocoList = new ArrayList<>();
		 chocoList.add(c1);
		 chocoList.add(c2);
		 chocoList.add(c3);
		  
		return chocoList;
	}

	@Override
	public List<Chocolates> updateQuantity() {
		// TODO Auto-generated method stub
		List<Chocolates> updatedChocolates = (List<Chocolates>) chocoRepo.findAll();
		 for(Chocolates c: updatedChocolates ) {
			 c.setQuantity(350);
		 }
		 chocoRepo.saveAll(updatedChocolates);
		return updatedChocolates; //this method retreives all chocolates and will set the quanitity of all to 350
	}

	@Override
	public Chocolates chocolateDeleteByName(String chocName) {
		// TODO Auto-generated method stub
		Chocolates ch= chocoRepo.findByChocolateName("MangoBite");
				chocoRepo.delete(ch);		
		return ch;
	}
 
	
	 
	

}// end of choco service class
