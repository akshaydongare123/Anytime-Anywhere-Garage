package com.project.services;

import java.util.Collections;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.daos.UserDao;
import com.project.daos.VehicleDao;
import com.project.dtos.Credential;
import com.project.dtos.UserDTO;
import com.project.dtos.VehicleDTO;
import com.project.entities.User;
import com.project.entities.Vehicle;

@Transactional
@Service
public class UserServiceImpl {

	@Autowired
	private UserDao userDao;

	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@Autowired
	private ModelMapper modelMapper;

	public UserDTO findUserByEmailAndPassword(Credential cred) {

		User dbUser = userDao.findByEmail(cred.getEmail());

		if (dbUser != null && encoder.matches(cred.getPassword(), dbUser.getPassword())) {

			return modelMapper.map(dbUser, UserDTO.class);

		}
		return null;
	}

	public UserDTO saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		user.setRole("user");
		user = userDao.save(user);
		System.out.println(user);
		return modelMapper.map(user, UserDTO.class);

	}

	public UserDTO findUserById(int userId) {
		UserDTO userDto = new UserDTO();
		Optional<User> user = userDao.findById(userId);
		if (user != null) {
			userDto = modelMapper.map(user, UserDTO.class);
			return userDto;
		} else
			return null;
	}
	    
	    //updateUser
	
	public Map<String, Object> editUser(int userId, UserDTO userDto) {
		if(userDao.existsById(userId)) {
			userDto.setId(userId);
			
			User user=modelMapper.map(userDto, User.class);
			//shop=shopDao.findById(shopDto.getId()));
			//setUser(userDao.findById(blogDto.getUserId()));
			user = userDao.save(user);
			return Collections.singletonMap("user upadated", user);
		}
		return Collections.singletonMap("service failed to update", 0);
	}
	
	
	//add vehicle 
		public VehicleDTO saveVehicle(Vehicle vehicle) {
			
			
			vehicle = vehicleDao.save(vehicle);
			System.out.println(vehicle);
			return modelMapper.map(vehicle, VehicleDTO.class);

		}
		
		//edit vehicle
		public Map<String, Object> editVehicle(int vehicleId, VehicleDTO vehicleDto) {
			if(vehicleDao.existsById(vehicleId)) {
				vehicleDto.setId(vehicleId);
				
				Vehicle vehicle=modelMapper.map(vehicleDto, Vehicle.class);
				
				vehicle = vehicleDao.save(vehicle);
				return Collections.singletonMap("vehicle upadated", vehicle);
			}
			return Collections.singletonMap("vehicle failed to update", 0);
		}
			
		
		public Optional<User> getUserById(int userId) {
			
			Optional<User> user = userDao.findById(userId);
			if (user != null) {
			
				return user;
			} else
				return null;
		}

	
}

