package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.entity.Chocolates;
import com.shopping.model.ChocolateRequest;
import com.shopping.service.ChocolateService;
import com.shopping.service.ChocolateServiceInterface;

@RestController
public class ChocolateController  {

	@Autowired
	private ChocolateServiceInterface<Chocolates> chocoService;
	
	//1.
	@RequestMapping(value="/chocolates", method = RequestMethod.POST,produces="application/json",consumes="application/json")
	public  @ResponseBody Chocolates createChocolates(@RequestBody ChocolateRequest chocRequest){
		Chocolates choc = chocoService.createChocolates(chocRequest);
		return choc;
	}
	
	//2.
	@RequestMapping(value = "/getAllChocolates", method = RequestMethod.GET)
	public Iterable getAllChocolates() {
		Iterable chocFound = chocoService.getAllChocolates();
		System.out.println("Find all Chocolates");
		return chocFound;
	}
	
	//3. 
	@RequestMapping(value = "/getChocolate/{chocName}", method = RequestMethod.GET)
	public Chocolates getByChocolateName(@PathVariable(value = "chocName") String chocName){
		Chocolates chocFound = chocoService.getByChocolateName(chocName);
		return chocFound;
		
	}
	
	
	/******************OLD*********************************************/
	/*@RequestMapping(value="/createChocolates", method= RequestMethod.GET)
	public List<Chocolates> createChocolates(){
		List<Chocolates> chocolateList = chocoService.chocolateCreation();
		return chocolateList;
	}*/
	
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
