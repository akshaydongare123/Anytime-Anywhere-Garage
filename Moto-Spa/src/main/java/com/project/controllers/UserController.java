package com.project.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.dtos.Credential;
import com.project.dtos.Response;
import com.project.dtos.UserDTO;
import com.project.dtos.VehicleDTO;
import com.project.entities.User;
import com.project.entities.Vehicle;
import com.project.services.UserServiceImpl;

@CrossOrigin
@RequestMapping(value = "/users")
@RestController
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	@PostMapping("/signin")
	public ResponseEntity<?> login(@RequestBody Credential cred) {

		UserDTO userDto = userService.findUserByEmailAndPassword(cred);

		if (userDto == null) {
			System.out.println(userDto);
			return Response.error("user not found");
		}
		return Response.success(userDto);
	}

	@PostMapping("/signup")
	public ResponseEntity<?> signup(@RequestBody User user) {
		return ResponseEntity.ok(userService.saveUser(user));
	}
	
	//update user
	
	@PutMapping("/edituser/{id}")
	public ResponseEntity<?> editUser(@PathVariable("id") int id,@RequestBody UserDTO userDto) {
		return ResponseEntity.ok(userService.editUser(id,userDto));
	}
	
	// add vehicle 
	@PostMapping("/vehicle/addvehicle")
		public ResponseEntity<?> addVehicle(@RequestBody Vehicle vehicle) {
			return ResponseEntity.ok(userService.saveVehicle(vehicle));
			}
		
	

	//edit vehicle
	@PutMapping("/vehicle/editvehicle/{id}")
	public ResponseEntity<?> editService(@PathVariable("id") int id,@RequestBody VehicleDTO vehicleDto) {
		return ResponseEntity.ok(userService.editVehicle(id,vehicleDto));
	}
	
	//FIND USER
		@GetMapping("/finduser/{id}")
		public ResponseEntity<?> findUserById(@PathVariable("id") int userId){
			Optional<User> user= userService.getUserById(userId);
			return Response.success(user);
		}

	
}
