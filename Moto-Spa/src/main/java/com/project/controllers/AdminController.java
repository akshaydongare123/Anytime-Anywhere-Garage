package com.project.controllers;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dtos.RepairShopDTO;
import com.project.dtos.Response;
import com.project.dtos.ServicePlanDTO;
import com.project.dtos.UserDTO;
import com.project.entities.MakeModel;
import com.project.entities.RepairShop;
import com.project.entities.ServicePlan;
import com.project.services.AdminServiceImpl;

@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminServiceImpl adminserviceImpl;
	
	//delete user
	@DeleteMapping("/user/delete/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable("id") int id) {
		Map<String, Object> result = adminserviceImpl.deleteUser(id);
		return Response.success(result);
	}
	
	//delete shop
	@DeleteMapping("/shop/delete/{id}")
	public ResponseEntity<?> deleteShop(@PathVariable("id") int id) {
		Map<String, Object> result = adminserviceImpl.deleteShop(id);
		return Response.success(result);
	}
	
	//delete service
		@DeleteMapping("/service/delete/{id}")
		public ResponseEntity<?> deleteService(@PathVariable("id") int id) {
			Map<String, Object> result = adminserviceImpl.deleteService(id);
			return Response.success(result);
		}
	
	//delete model
		@DeleteMapping("/makeModel/delete/{id}")
		public ResponseEntity<?> deleteModel(@PathVariable("id") int id) {
			Map<String, Object> result = adminserviceImpl.deleteModel(id);
			return Response.success(result);
			}	
		
	//add service 
	@PostMapping("/service/addservice")
	public ResponseEntity<?> addService(@RequestBody ServicePlan servicePlan) {
		return ResponseEntity.ok(adminserviceImpl.saveServicePlan(servicePlan));
	}
	
	
	// edit service
	@PutMapping("/service/editservice/{id}")
	public ResponseEntity<?> editService(@PathVariable("id") int id,@RequestBody ServicePlanDTO serviceDto) {
		return ResponseEntity.ok(adminserviceImpl.editService(id,serviceDto));
	}
	
	// add shop
	@PostMapping("/shop/addshop")
	public ResponseEntity<?> addShop(@RequestBody RepairShop shop) {
		return ResponseEntity.ok(adminserviceImpl.saveShop(shop));
	}
	
	// add model
	@PostMapping("/model/addModel")
	public ResponseEntity<?> addModel(@RequestBody MakeModel model) {
		return ResponseEntity.ok(adminserviceImpl.saveModel(model));
	}
	
	//edit shop
	@PutMapping("/shop/editshop/{id}")
	public ResponseEntity<?> editShop(@PathVariable("id") int id,@RequestBody RepairShopDTO shop) {
		return ResponseEntity.ok(adminserviceImpl.editShop(id,shop));
	}
	
	//find shop by id
	@GetMapping("/shop/findshop/{id}")
	public ResponseEntity<?> findShopById(@PathVariable("id") int shopId){
		Optional<RepairShop> shop= adminserviceImpl.getShopById(shopId);
		return Response.success(shop);
	}
	
	// get all user
	
	@GetMapping("/getallusers")
	public ResponseEntity<?> getAllUser(){
		List<UserDTO> userDto = adminserviceImpl.getUser();
		return Response.success(userDto);
	}
	
}
