package com.clone.controllers;

import com.opensymphony.xwork2.ActionSupport;

public class CloneAdminController extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4817523745185644419L;
	private String input;
	public String execute() throws Exception {
		return SUCCESS;
	}
	public String getInput() {
		return input;
	}
	public void setInput(String input) {
		this.input = input;
	}
	
}
