package com.example.user.ui.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class userRequestModel {
	@NotNull(message="not null")
	@Size(min=2,message="not less than 2")
private String firstName;
	@NotNull(message="not null")
	@Size(min=2,message="not less than 2")
private String lastName;
	@NotNull(message="not null")
	@Size(min=2,max=16,message="not less than 16")
private String password;
	@NotNull(message="not null")
	@Email
private String mail;
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

}
