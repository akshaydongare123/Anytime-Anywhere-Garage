package com.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="service")
public class ServicePlan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int id;
	@Column(name="service_name")
	private String serviceName;
	@Column(name="service_details")
	private String serviceDetails;
	@Column(name="service_price")
	private double servicePrice;
	@Column( name="shop_id")
	private Integer shopId;
	
	public ServicePlan() {
		// TODO Auto-generated constructor stub
	}
	
	public ServicePlan(int id, String serviceName, String serviceDetails, double servicePrice, Integer shopId) {
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
		return "ServicePlan [id=" + id + ", serviceName=" + serviceName + ", serviceDetails=" + serviceDetails
				+ ", servicePrice=" + servicePrice + ", shopId=" + shopId + "]";
	}
	
	//private RepairShop repairShop;

}

	/*
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
	@Table(name="service")
	public class ServicePlan {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column
		private int id;
		@Column(name="service_name")
		private String serviceName;
		@Column(name="service_details")
		private String serviceDetails;
		@Column(name="service_price")
		private double servicePrice;
//		@Column(name="shop_id")
//		private int shopId;	
		
		
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="shop_id")
		private RepairShop repairShop;
		
		
		public ServicePlan() {
			// TODO Auto-generated constructor stub
		}


		public ServicePlan(int id, String serviceName, String serviceDetails, double servicePrice, int shopId,
				RepairShop repairShop) {
			super();
			this.id = id;
			this.serviceName = serviceName;
			this.serviceDetails = serviceDetails;
			this.servicePrice = servicePrice;
			//this.shopId = shopId;
			this.repairShop = repairShop;
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


//		public int getShopId() {
//			return shopId;
//		}
	//
	//
//		public void setShopId(int shopId) {
//			this.shopId = shopId;
//		}
	//

		public RepairShop getRepairShop() {
			return repairShop;
		}


		public void setRepairShop(RepairShop repairShop) {
			this.repairShop = repairShop;
		}


		@Override
		public String toString() {
			return "ServicePlan [id=" + id + ", serviceName=" + serviceName + ", serviceDetails=" + serviceDetails
					+ ", servicePrice=" + servicePrice + ", repairShop=" + repairShop + "]";
		}


		
		
	}

	 */
	 