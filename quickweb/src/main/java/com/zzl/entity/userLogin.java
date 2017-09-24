package com.zzl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_login")
public class userLogin {
	@Id
	@GeneratedValue
	private String id;
	@Column(name = "password")
	private String password;
	
	public String getID() {
		return this.id;
	}
	public void setID(String id) {
		this.id=id;
	}
	public String getpassword(){
		return this.password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
}
