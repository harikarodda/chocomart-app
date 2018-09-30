package com.shopping.entity;

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

	public String getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(String updatedTime) {
		this.updatedTime = updatedTime;
	}

	public String getAuthoroziedBy() {
		return authoroziedBy;
	}

	public void setAuthoroziedBy(String authoroziedBy) {
		this.authoroziedBy = authoroziedBy;
	}

	public String getAuthorizedTime() {
		return authorizedTime;
	}

	public void setAuthorizedTime(String authorizedTime) {
		this.authorizedTime = authorizedTime;
	}

	
	
	@Column (name="Role_Name")
	String roleName;
	
	@Column (name="Role_Status")
	String roleStatus;
	
	
	@Column (name="Role_UpdatedBy")
	String updatedBy;
	
	@Column (name="Role_UpdatedTime")
	String updatedTime;
	
	@Column (name="Role_AuthorizedBy")
	String authoroziedBy;
	
	@Column (name="Role_AuthorizedTime")
	String authorizedTime;
	
	//getters and setters
	
	public Roles() {

	}

}//end of class
