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
		try{
		//HEY IDIOT ================================================>
		if ( user.getEmail()==null||user.getEmail().equals("")){//RESOLVE LATER .getEmail May be null at some point 
			addFieldError( "user.email", "Username is required." );
		}
		if ( user.getPass()==null){ 
				addFieldError( "user.pass", "password is required." );
		}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
	public CloneUser getUser() {
		return user;
	}
	public void setUser(CloneUser cuser) {
		this.user = cuser;
	}	
}
