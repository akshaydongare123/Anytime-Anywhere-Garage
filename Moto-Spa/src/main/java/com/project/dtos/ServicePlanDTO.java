package com.project.dtos;

public class ServicePlanDTO {
	private int id;
	private String serviceName;
	private String serviceDetails;
	private double servicePrice;
	//private RepairShop shop;
	private int shopId;
	public ServicePlanDTO() {
		
	}
	public ServicePlanDTO(int id, String serviceName, String serviceDetails, double servicePrice, int shopId) {
		super();
		this.id = id;
		this.serviceName = serviceName;
		this.serviceDetails = serviceDetails;
		this.servicePrice = servicePrice;
		this.shopId = shopId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServiceDetails() {
		return serviceDetails;
	}
	public void setServiceDetails(String serviceDetails) {
		this.serviceDetails = serviceDetails;
	}
	public double getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(double servicePrice) {
		this.servicePrice = servicePrice;
	}
	public int getShopId() {
		return shopId;
	}
	public void setShopId(int shopId) {
		this.shopId = shopId;
	}
	@Override
	public String toString() {
		return "ServicePlanDTO [id=" + id + ", serviceName=" + serviceName + ", serviceDetails=" + serviceDetails
				+ ", servicePrice=" + servicePrice + ", shopId=" + shopId + "]";
	}
	
}
