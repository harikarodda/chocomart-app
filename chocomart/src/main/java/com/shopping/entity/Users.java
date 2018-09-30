package com.shopping.entity;

import javax.persistence.Column;

//import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User_master")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "user_id")
	int userId;

	
	@Column(name = "user_name")
	String username;
	
	@Column(name = "user_password")
	String password;
	
	@Column(name = "user_country")
	String country;
	
	@Column(name = "user_updatedBy")
	String updated_by;
	
	@Column(name = "user_authorizedBy")
	String authorized_by;
	
	@Column(name = "user_lastLogin")
	String last_loginTime;
	
	@Column(name = "user_updatedTime")
	String updatedTime;
	
	@Column(name = "user_authorizedTime")
	String authorizedTime;

	public Users() {

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(String updated_by) {
		this.updated_by = updated_by;
	}

	public String getAuthorized_by() {
		return authorized_by;
	}

	public void setAuthorized_by(String authorized_by) {
		this.authorized_by = authorized_by;
	}

	public String getLast_loginTime() {
		return last_loginTime;
	}

	public void setLast_loginTime(String last_loginTime) {
		this.last_loginTime = last_loginTime;
	}

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getAuthorizedTime() {
		return authorizedTime;
	}

	public void setAuthorizedTime(String authorizedTime) {
		this.authorizedTime = authorizedTime;
	}

	

} // end of Entity
