package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Chocolates;
import com.shopping.service.ChocolateService;
import com.shopping.service.ChocolateServiceInterface;

@RestController
public class ChocolateController  {

	@Autowired
	private ChocolateServiceInterface<Chocolates> chocoService;
	
	
	@RequestMapping(value="/createChocolates", method= RequestMethod.GET)
	public List<Chocolates> createChocolates(){
		List<Chocolates> chocolateList = chocoService.chocolateCreation();
		return chocolateList;
	}
	
	@PostMapping(value="/updateChocolates") //CHECK IN POSTMAN
	public List<Chocolates> updateChocolateQuantity(){
		List<Chocolates> chocList = chocoService.updateQuantity();
		System.out.println("change quantioty of all chocolates");
		return chocList;
		
	}
	
	@DeleteMapping(value="/deleteChocolate/{chocolateName}")  //CHECK IN POSTMAN
	public  Chocolates deletebyChocolateName(@PathVariable(value= "chocolateName") String chocolateName){
		 Chocolates deleteItem= chocoService.chocolateDeleteByName("MangoBite");
		System.out.println("Delete  Chocolates By the name provided in URL");
		return deleteItem;
		
	}
	
}//end of controller class
