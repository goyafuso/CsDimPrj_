package com.clone.controllers;

import com.clone.models.CloneUser;
import com.opensymphony.xwork2.ActionSupport;

public class CloneLogin extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = -3588932708397328206L;
	private CloneUser user;
	
	public String execute() throws Exception {
		if(true) {
		
			return SUCCESS;
		} else {
			return "DENY";
		}		
	}
	public void validate(){
		if(!(user==null)){
			if(user.getEmail().length()<=0){
				addFieldError("user.email","User name is required");
			}
			if(user.getPass().length()<=0){
				addFieldError("user.pass","Password is required");
			}
		} else {
			addFieldError("user.email","User name and password are reqired to login");
		}
	}
	public CloneUser getUser() {
		return user;
	}
	public void setUser(CloneUser cuser) {
		this.user = cuser;
	}	
}
