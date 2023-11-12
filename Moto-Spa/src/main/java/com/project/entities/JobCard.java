package com.project.entities;

import java.sql.Time;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
// id      | schedule_date | schedule_time | user_id | vehicle_id | service_id | shop_id | insert_ts
@Entity
@Table(name="jobcard")
public class JobCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	@Column(name="schedule_date")
	private Date date;
	@Column(name="schedule_time")
	private Time time;
	@Column(name="user_id")
	private int userId;
	@Column(name="vehicle_id")
	private int vehicleId;
	@Column(name="service_id")
	private int serviceId;
	@Column(name="shop_id")
	private int shopId;
	
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="user_id")
//	private User user;
//	
//	@ManyToOne
//	@JoinColumn(name="service_id")
//	private ServicePlan service;
//	
//	@ManyToOne(fetch = FetchType.EAGER)
//	@JoinColumn(name="shop_id")
//	private  RepairShop shop;

	public JobCard() {
		// TODO Auto-generated constructor stub
	}

public JobCard(int id, Date date, Time time, int userId, int vehicleId, int serviceId, int shopId) {
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
	return "JobCard [id=" + id + ", date=" + date + ", time=" + time + ", userId=" + userId + ", vehicleId=" + vehicleId
			+ ", serviceId=" + serviceId + ", shopId=" + shopId + "]";
}
	
	

//	public JobCard(int id, Date date, Time time, int vehicleId, User user, ServicePlan service, RepairShop shop) {
//		super();
//		this.id = id;
//		this.date = date;
//		this.time = time;
//		this.vehicleId = vehicleId;
//		this.user = user;
//		this.service = service;
//		this.shop = shop;
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public Date getDate() {
//		return date;
//	}
//
//	public void setDate(Date date) {
//		this.date = date;
//	}
//
//	public Time getTime() {
//		return time;
//	}
//
//	public void setTime(Time time) {
//		this.time = time;
//	}
//
//	public int getVehicleId() {
//		return vehicleId;
//	}
//
//	public void setVehicleId(int vehicleId) {
//		this.vehicleId = vehicleId;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public ServicePlan getService() {
//		return service;
//	}
//
//	public void setService(ServicePlan service) {
//		this.service = service;
//	}
//
//	public RepairShop getShop() {
//		return shop;
//	}
//
//	public void setShop(RepairShop shop) {
//		this.shop = shop;
//	}
//
//	@Override
//	public String toString() {
//		return "JobCard [id=" + id + ", date=" + date + ", time=" + time + ", vehicleId=" + vehicleId + ", user=" + user
//				+ ", service=" + service + ", shop=" + shop + "]";
//	}
	
	
}


/*
 public JobCard() {
		// TODO Auto-generated constructor stub
	}


	public JobCard(int id, Date date, Time time, int vehicleId, int serviceId,  User user, RepairShop shop) {
		super();
		this.id = id;
		this.date = date;
		this.time = time;
		this.vehicleId = vehicleId;
		this.serviceId = serviceId;
		this.user = user;
		this.shop = shop;
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

	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public RepairShop getShop() {
		return shop;
	}


	public void setShop(RepairShop shop) {
		this.shop = shop;
	}


	@Override
	public String toString() {
		return "JobCard [id=" + id + ", date=" + date + ", time=" + time + ", vehicleId=" + vehicleId + ", serviceId="
				+ serviceId  + ", user=" + user + ", shop=" + shop + "]";
	}
	
 * 
 * 
 * 
 * */
