package com.example.user.ui.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class userEntity implements Serializable {
	private static final long serialVersionUID = 3097331402466429644L;
	@Id
	@GeneratedValue
	private long id;
	@Column(nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false, unique = true)
	private String mail;
	@Column(nullable = false, unique = true)
	private String userId;
	@Column(nullable = false, unique = true)
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
