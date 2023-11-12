package com.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.dtos.Response;
import com.project.dtos.VehicleDTO;
import com.project.entities.MakeModel;
import com.project.entities.Vehicle;
import com.project.services.VehicleServiceImpl;

@CrossOrigin
@RestController
public class VehicleController {
	
	@Autowired
	private VehicleServiceImpl vehicleService;
	
	@GetMapping("/allvehicles")
	public ResponseEntity<?> getVehicles(){
		List<VehicleDTO> vehicles = vehicleService.getAllVehicles();
		return Response.success(vehicles);
	}
	
	@GetMapping("/findvehicle/{id}")
	public ResponseEntity<?> getVehicleById(@PathVariable("id") int vehicleId){
		Optional<Vehicle> vehicle= vehicleService.getVehicleById(vehicleId);
		return Response.success(vehicle);
	}
	
	
}
