package com.clone.models;

public class CloneUser {
	private int id;
	private String fname;
	private String lname;
	private String pass;
	private String DOB;
	private String email;
	public CloneUser(){
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	//TESTING ONLY
	@Override
	public String toString() {
		return "CloneUser [id=" + id + ", fname=" + fname + ", lname=" + lname
				+ ", pass=" + pass + ", DOB=" + DOB + ", email=" + email + "]";
	}
	
	
	
}
