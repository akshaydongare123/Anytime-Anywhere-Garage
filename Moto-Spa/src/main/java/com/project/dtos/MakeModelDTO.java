package com.project.dtos;

public class MakeModelDTO {

	private int id;
	private String makeName;
	private String  modelName;
	private String vehicleType;	
	//private List<VehicleDTO> vehicles;

	public MakeModelDTO() {
		
	}
	//List<VehicleDTO> vehicles,
	public MakeModelDTO(int id, String makeName, String modelName,  String vehicleType) {
		super();
		this.id = id;
		this.makeName = makeName;
		this.modelName = modelName;
		this.vehicleType = vehicleType;
		//this.vehicles = vehicles;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMakeName() {
		return makeName;
	}

	public void setMakeName(String makeName) {
		this.makeName = makeName;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

//	public List<VehicleDTO> getVehicles() {
//		return vehicles;
//	}
//
//	public void setVehicles(List<VehicleDTO> vehicles) {
//		this.vehicles = vehicles;
//	}

	@Override
	public String toString() {
		return "MakeModelDTO [id=" + id + ", makeName=" + makeName + ", modelName=" + modelName + ", vehicleType="
				+ vehicleType  + "]";
	}

	//+ ", vehicles=" + vehicles
	
	
	
}
