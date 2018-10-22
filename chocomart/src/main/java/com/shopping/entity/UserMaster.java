package com.shopping.entity;

import java.util.Date;

import javax.persistence.Column;

//import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_master")
public class UserMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	@Column(name = "user_id")
	private  int userId;

	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private 	String password;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "last_loginTime")
	private Date lastLoginTime;
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
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

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getAuthorizedBy() {
		return authorizedBy;
	}

	public void setAuthorizedBy(String authorizedBy) {
		this.authorizedBy = authorizedBy;
	}

	public Date getAuthorizedTime() {
		return authorizedTime;
	}

	public void setAuthorizedTime(Date authorizedTime) {
		this.authorizedTime = authorizedTime;
	}

	@Column(name = "updated_By")
	private String updatedBy;
	
	@Column(name = "updated_time")
	private Date updatedTime;
	
	@Column(name = "authorized_By")
	private String authorizedBy;
	
	@Column(name = "authorized_time")
	private Date authorizedTime;

	
}