package com.project.dtos;

import java.sql.Time;
import java.util.Date;

import com.project.entities.ServicePlan;
import com.project.entities.User;

public class JobCardDTO {

	private int id;
	private Date date;
	private Time time;
	 private int userId;
	private int vehicleId;
	 private int serviceId;
	 private int shopId;
//	private User user;
//	private ServicePlan service;
	// private RepairShopDTO shop;

	public JobCardDTO() {
		// TODO Auto-generated constructor stub
	}
public JobCardDTO(int id, Date date, Time time, int userId, int vehicleId, int serviceId, int shopId) {
	super();
	this.id = id;
	this.date = date;
	this.time = time;
	this.userId = userId;
	this.vehicleId = vehicleId;
	this.serviceId = serviceId;
	this.shopId = shopId;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public Time getTime() {
	return time;
}
public void setTime(Time time) {
	this.time = time;
}
public int getUserId() {
	return userId;
}
public void setUserId(int userId) {
	this.userId = userId;
}
public int getVehicleId() {
	return vehicleId;
}
public void setVehicleId(int vehicleId) {
	this.vehicleId = vehicleId;
}
public int getServiceId() {
	return serviceId;
}
public void setServiceId(int serviceId) {
	this.serviceId = serviceId;
}
public int getShopId() {
	return shopId;
}
public void setShopId(int shopId) {
	this.shopId = shopId;
}
@Override
public String toString() {
	return "JobCardDTO [id=" + id + ", date=" + date + ", time=" + time + ", userId=" + userId + ", vehicleId="
			+ vehicleId + ", serviceId=" + serviceId + ", shopId=" + shopId + "]";
}


	
}
