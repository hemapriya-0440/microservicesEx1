package com.example.user.ui.dto;

import java.io.Serializable;

public class userdto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4555157471480901984L;

	private String firstName;

	private String lastName;

	private String password;

	private String mail;
	private String userId;
	private String encryptpwd;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getEncryptpwd() {
		return encryptpwd;
	}
	public void setEncryptpwd(String encryptpwd) {
		this.encryptpwd = encryptpwd;
	}
}
