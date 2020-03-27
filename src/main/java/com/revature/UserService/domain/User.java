package com.revature.UserService.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "username")
//@Table(name = "usr")
@Entity
@Table
public class User {
	
	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Transient
	private List<Car> carList;

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Car> getCarList() {
		return carList;
	}
	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}
	
}
