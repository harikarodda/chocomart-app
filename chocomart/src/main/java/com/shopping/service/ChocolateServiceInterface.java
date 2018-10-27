package com.shopping.service;

import java.util.List;

import com.shopping.entity.Chocolates;
import com.shopping.model.ChocolateRequest;

public interface ChocolateServiceInterface<Chocolates> {
	
	Chocolates createChocolates(ChocolateRequest chocReq);
	public Iterable<Chocolates> getAllChocolates();
	public Chocolates getByChocolateName(String chocName);
	
	
	
	
	// ************************************OLD *************************//
	
	//List<Chocolates> chocolateCreation();
	
	List<com.shopping.entity.Chocolates> updateQuantity();

		// com.shopping.entity.Chocolates chocolateDeleteByName();

	com.shopping.entity.Chocolates chocolateDeleteByName(String string);

	
	 

	// ************************************************************************************************************//
}
