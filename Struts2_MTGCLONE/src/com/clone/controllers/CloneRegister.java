package com.clone.controllers;

import com.clone.models.CloneUser;
import com.clone.models.dao.CloneUserDao;
import com.opensymphony.xwork2.ActionSupport;

public class CloneRegister extends ActionSupport {
	/**
	 */
	private static final long serialVersionUID = 1L;
	private CloneUser user;
	private String confirm;
	private CloneUserDao cloneUserDao = new CloneUserDao();
	public String execute() throws Exception{
		if(cloneUserDao.insert(user)){
			return SUCCESS;
		} else {
			return "FAILURE";
		}
	}
	public void validate(){
		if(user==null){
			addFieldError( "user.fname", "First name is required." );
			addFieldError( "user.lname", "Last name is required." );
			addFieldError( "user.pass", "A password is required." );
			addFieldError( "user.DOB", "Date of birth required." );
			addFieldError( "user.email", "An email is required." );
		} else {
			if(user.getFname().length()<=0){
				addFieldError( "user.fname", "First name is required." );
			}
			if(user.getLname().length()<=0){
				addFieldError( "user.lname", "Last name is required." );
			}
			if(user.getPass().length()<=0){
				addFieldError( "user.pass", "A password is required." );
			}
			if(user.getDOB().length()<=0){
				addFieldError( "user.DOB", "Date of birth required." );
			}
			if(user.getEmail().length()<=0){
				addFieldError( "user.email", "An email is required." );
			}
			if(!user.getPass().equals(confirm)){
				addFieldError("user.pass", "Password must mach");
				addFieldError("confirm", "Password must mach");
			}
		}
	}
	public CloneUser getUser() {
		return user;
	}
	public void setUser(CloneUser cloneUser) {
		this.user = cloneUser;
	}
	public String getConfirm() {
		return confirm;
	}
	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}
}
