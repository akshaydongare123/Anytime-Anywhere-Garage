// id | first_name | last_name | address  | mobile     | email           | password   | role  | insert_ts
package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name= "user")
public class User {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name= "first_name")
	private String firstName;
	@Column(name= "last_name")
	private String lastName;
	@Column
	private String address;
	@Column
	@Pattern(regexp="^[0-9]{10}$")
	private String mobile;
	@Column
	private String email;
	@Column
	@Size(min = 5)
	private String password;
	@Column
	private String role;
	
	//check for persist and other functionalities 
//	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
//	private List<Vehicle> vehicles;
	
	public User() {
		
	}


	public User(int id, String firstName, String lastName, String address, String mobile, String email, String password,
			String role) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.password = password;
		this.role = "user";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = "user";
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address
				+ ", mobile=" + mobile + ", email=" + email + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
