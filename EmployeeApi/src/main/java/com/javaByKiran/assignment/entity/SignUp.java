package com.javaByKiran.assignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SignUp {
	private String name;
	private String userName;
	@Id
	private String emailId;
	private String passWord;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public SignUp(String name, String userName, String emailId, String passWord) {
		super();
		this.name = name;
		this.userName = userName;
		this.emailId = emailId;
		this.passWord = passWord;
	}
	public SignUp() {
		
	}
	@Override
	public String toString() {
		return "SignUp [name=" + name + ", userName=" + userName + ", emailId=" + emailId + ", passWord=" + passWord
				+ "]";
	}
	
	
	

}
