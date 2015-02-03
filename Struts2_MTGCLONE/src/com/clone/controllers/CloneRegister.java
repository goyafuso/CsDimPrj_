package com.clone.controllers;

import com.clone.models.CloneUser;
import com.clone.models.dao.CloneUserDao;
import com.opensymphony.xwork2.ActionSupport;

public class CloneRegister extends ActionSupport {
	/**
	 */
	private static final long serialVersionUID = 1L;
	private CloneUser user;
	private CloneUserDao cloneUserDao = new CloneUserDao();
	public String execute() throws Exception{
		if(cloneUserDao.insert(user)){
			return SUCCESS;
		} else {
			return "FAILURE";
		}
	}
	public CloneUser getCloneUser() {
		return user;
	}
	public void setCloneUser(CloneUser cloneUser) {
		this.user = cloneUser;
	}
	
}
