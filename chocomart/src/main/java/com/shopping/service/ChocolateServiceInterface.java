package com.shopping.service;

import java.util.List;

import com.shopping.entity.Chocolates;

public interface ChocolateServiceInterface<Chocolates> {
	List<Chocolates> chocolateCreation();

	List<com.shopping.entity.Chocolates> updateQuantity();

	//com.shopping.entity.Chocolates chocolateDeleteByName();

	com.shopping.entity.Chocolates chocolateDeleteByName(String string);  

}
