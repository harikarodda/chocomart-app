package com.shopping.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Role_Master")
public class Roles {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="Role_ID")
	int roleId;
	
	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleStatus() {
		return roleStatus;
	}

	public void setRoleStatus(String roleStatus) {
		this.roleStatus = roleStatus;
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

	public void setUpdatedTime(Date string) {
		this.updatedTime = string;
	}

	public String getAuthoroziedBy() {
		return authoroziedBy;
	}

	public void setAuthoroziedBy(String authoroziedBy) {
		this.authoroziedBy = authoroziedBy;
	}

	public Date getAuthorizedTime() {
		return authorizedTime;
	}

	public void setAuthorizedTime(Date date) {
		this.authorizedTime = date;
	}

	
	
	@Column (name="Role_Name")
	String roleName;
	
	@Column (name="Role_Status")
	String roleStatus;
	
	
	@Column (name="Role_UpdatedBy")
	String updatedBy;
	
	@Column (name="Role_UpdatedTime")
	Date updatedTime;
	
	@Column (name="Role_AuthorizedBy")
	String authoroziedBy;
	
	@Column (name="Role_AuthorizedTime")
	Date authorizedTime;
	
	//getters and setters
	
	public Roles() {

	}

}//end of class
