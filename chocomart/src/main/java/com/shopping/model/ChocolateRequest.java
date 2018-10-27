package com.shopping.model;

import org.springframework.stereotype.Component;

@Component
public class ChocolateRequest {
	
	String chocolateName;
	int quantity;
	String chocolateDescription;
	
	
	public String getChocolateName() {
		return chocolateName;
	}
	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getChocolateDescription() {
		return chocolateDescription;
	}
	public void setChocolateDescription(String chocolateDescription) {
		this.chocolateDescription = chocolateDescription;
	}
	

}
