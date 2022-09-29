package com.javaByKiran.assignment.entity;

import org.springframework.stereotype.Component;

@Component
public class Login {
	private String emailId;
	private String passWord;
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
	public Login() {
	}
	@Override
	public String toString() {
		return "Login [emailId=" + emailId + ", passWord=" + passWord + "]";
	}
	
	
}
