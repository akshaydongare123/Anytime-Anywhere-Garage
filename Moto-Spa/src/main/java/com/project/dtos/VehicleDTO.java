package com.project.dtos;

public class VehicleDTO {

	private int id;
	private String licencePlate;
	private int userId;
	private int modelId;
	private int manufacturedYear;
//	private User user;
//	private MakeModel makeModel;

	public VehicleDTO() {
		// TODO Auto-generated constructor stub
	}

	public VehicleDTO(int id, String licencePlate, int userId, int modelId, int manufacturedYear) {
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
		return "VehicleDTO [id=" + id + ", licencePlate=" + licencePlate + ", userId=" + userId + ", modelId=" + modelId
				+ ", manufacturedYear=" + manufacturedYear + "]";
	}
}
