package com.shopping.entity;

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
	
	@Column(name="Chocolate_name")
	String chocolateName;
	
	@Column(name="Chocolate_Description")
	String chocolateDescription;
	
	@Column(name="Updated_By")
	String updatedBy;
	
	@Column(name="Updated_Time")
	String updatedTime;
	
	@Column(name="Authorized_By")
	String authorizedBy;
	
	@Column(name="Authorized_Time")
	String authorizedTime;
	
	@Column(name="Quantity")
	int quantity;
	
}
