package com.clone.controllers;

import com.opensymphony.xwork2.ActionSupport;

public class CloneController extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3162881055738535685L;
	private String mainContent;
	
	public String execute() throws Exception {
		System.out.println(mainContent+"b");
		if(mainContent==null){
			mainContent="home";
		}
		System.out.println(mainContent);
		switch(mainContent) {
			case "home": {
				mainContent="home";
				return "gotoHome";
				}
			case "login": {
				mainContent="login";
				return "gotoLogin";}
			case "register": {
				mainContent="registercloneuser";
				return "gotoRegister";}
			case "message": {
				mainContent="message";
				return "gotoMessage";}
			default:{
				return SUCCESS;
			}
		}
	}
	public String getMainContent() {
		return mainContent;
	}
	public void setMainContent(String mainContent) {
		this.mainContent = mainContent;
	}	
}
