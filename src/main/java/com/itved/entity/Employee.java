package com.itved.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "employeedetails")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	@NotEmpty
	private String name;
	@Email
	@Column(name = "email")
	private String email;
	@NotEmpty
	@Column(name="mobile")
	private String mobile;
	@NotEmpty
	@Column(name = "sal")
	private int sal;
	
	@NotEmpty
	@Column(name = "city")
	private String city;

	
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name,String email,String mobile, int sal,String city) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile= mobile;
		this.sal = sal;
		this.city= city;
	}

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
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}