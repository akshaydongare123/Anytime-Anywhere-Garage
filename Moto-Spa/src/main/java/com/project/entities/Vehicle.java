package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="vehicle")
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(name="licence_plate")
	private String licencePlate;
	@Column(name="user_id")
	private int userId;
	@Column(name="make_model_id")
	private int modelId;
	@Column(name="manufactured_year")
	private int manufacturedYear;	
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="user_id")
	//private User user;
	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="make_model_id")
	//private MakeModel makeModel;
	
	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

public Vehicle(int id, String licencePlate, int userId, int modelId, int manufacturedYear) {
	super();
	this.id = id;
	this.licencePlate = licencePlate;
	this.userId = userId;
	this.modelId = modelId;
	this.manufacturedYear = manufacturedYear;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getLicencePlate() {
	return licencePlate;
}

public void setLicencePlate(String licencePlate) {
	this.licencePlate = licencePlate;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
}

public int getModelId() {
	return modelId;
}

public void setModelId(int modelId) {
	this.modelId = modelId;
}

public int getManufacturedYear() {
	return manufacturedYear;
}

public void setManufacturedYear(int manufacturedYear) {
	this.manufacturedYear = manufacturedYear;
}

@Override
public String toString() {
	return "Vehicle [id=" + id + ", licencePlate=" + licencePlate + ", userId=" + userId + ", modelId=" + modelId
			+ ", manufacturedYear=" + manufacturedYear + "]";
}

	
}
