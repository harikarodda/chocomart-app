package com.shopping.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Chocolate_Master")
public class Chocolates {
	
	
	
	@Id
	@GeneratedValue(strategy=  GenerationType.AUTO)
	@Column (name="Chocolate_ID")
	int chocolateId;
	
	public int getChocolateId() {
		return chocolateId;
	}

	public void setChocolateId(int chocolateId) {
		this.chocolateId = chocolateId;
	}

	public String getChocolateName() {
		return chocolateName;
	}

	public void setChocolateName(String chocolateName) {
		this.chocolateName = chocolateName;
	}

	public String getChocolateDescription() {
		return chocolateDescription;
	}

	public void setChocolateDescription(String chocolateDescription) {
		this.chocolateDescription = chocolateDescription;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date date) {
		this.updatedTime = date;
	}

	public String getAuthorizedBy() {
		return authorizedBy;
	}

	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}

	public String getAuthorizedTime() {
		return authorizedTime;
	}

	public void setAuthorizedTime(String authorizedTime) {
		this.authorizedTime = authorizedTime;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Column(name="Chocolate_name")
	String chocolateName;
	
	@Column(name="Chocolate_Description")
	String chocolateDescription;
	
	@Column(name="Updated_By")
	String updatedBy;
	
	@Column(name="Updated_Time")
	Date updatedTime;
	
	@Column(name="Authorized_By")
	String authorizedBy;
	
	@Column(name="Authorized_Time")
	String authorizedTime;
	
	@Column(name="Quantity")
	int quantity;
	
	public Chocolates() {
		
	}
	
}
