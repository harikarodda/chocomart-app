package com.shopping.model;

import org.springframework.stereotype.Component;

@Component
public class RoleRequest {
	
	private String roleName;
	
	private String roleUpdatedBy;
	
	private String roleAuthorizedBy;
	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleUpdatedBy() {
		return roleUpdatedBy;
	}

	public void setRoleUpdatedBy(String roleUpdatedBy) {
		this.roleUpdatedBy = roleUpdatedBy;
	}

	public String getRoleAuthorizedBy() {
		return roleAuthorizedBy;
	}

	public void setRoleAuthorizedBy(String roleAuthorizedBy) {
		this.roleAuthorizedBy = roleAuthorizedBy;
	}

	
	

}
