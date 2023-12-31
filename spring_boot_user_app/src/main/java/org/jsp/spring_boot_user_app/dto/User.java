package org.jsp.spring_boot_user_app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int id;
private String name;
private String email;
private String pwd;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}
