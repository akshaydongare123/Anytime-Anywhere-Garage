package com.project.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.daos.MakeModelDao;
import com.project.daos.RepairShopDao;
import com.project.daos.ServicePlanDao;
import com.project.daos.UserDao;
import com.project.daos.VehicleDao;
import com.project.dtos.MakeModelDTO;
import com.project.dtos.RepairShopDTO;
import com.project.dtos.ServicePlanDTO;
import com.project.dtos.UserDTO;
import com.project.dtos.VehicleDTO;
import com.project.entities.MakeModel;
import com.project.entities.RepairShop;
import com.project.entities.ServicePlan;
import com.project.entities.User;
import com.project.entities.Vehicle;

@Transactional
@Service
public class AdminServiceImpl {
	@Autowired
	private VehicleDao vehicleDao;
	@Autowired
	private MakeModelDao makeModelDao;
	@Autowired
	private RepairShopDao shopDao;
	@Autowired
	private ServicePlanDao servicePlanDao;
	@Autowired
	private UserDao userdao;
	@Autowired
	private ModelMapper modelMapper;
	
	//delete user
	public Map<String, Object> deleteUser(int userId) {
		if(userdao.existsById(userId)) {
			userdao.deleteById(userId);
			return Collections.singletonMap("user deleted", 1);
		}
		return Collections.singletonMap("failed to delete user", 0);
	}
	
	//delete shop
	public Map<String, Object> deleteShop(int shopId) {
		if(shopDao.existsById(shopId)) {
			shopDao.deleteById(shopId);
			return Collections.singletonMap("shop deleted", 1);
		}
		return Collections.singletonMap("failed to delete shop", 0);
	}
	
	//delete service
		public Map<String, Object> deleteService(int serviceId) {
			if(servicePlanDao.existsById(serviceId)) {
				servicePlanDao.deleteById(serviceId);
				return Collections.singletonMap("service deleted", 1);
			}
			return Collections.singletonMap("failed to delete service", 0);
		}
	
	//add shop
	
	public RepairShopDTO saveShop(RepairShop shop) {
	
		//shop.setShopName(shop.getShopName());
		//shop.setShopEmail(shop.getShopEmail());;
		
		shop = shopDao.save(shop);
		System.out.println(shop);
		return modelMapper.map(shop, RepairShopDTO.class);

	}
	
	
	
	
	//add model 
		public MakeModelDTO saveModel(MakeModel model) {
				model = makeModelDao.save(model);
				System.out.println(model);
				return modelMapper.map(model, MakeModelDTO.class);

			}
	
	
	//add service
	
		public ServicePlanDTO saveServicePlan(ServicePlan servicePlan) {
			
			servicePlan = servicePlanDao.save(servicePlan);
			System.out.println(servicePlan);
			return modelMapper.map(servicePlan, ServicePlanDTO.class);

		}
	
	
	//edit shop
	public Map<String, Object> editShop(int shopId, RepairShopDTO shopDto) {
		if(shopDao.existsById(shopId)) {
			shopDto.setId(shopId);
			
			RepairShop shop=modelMapper.map(shopDto, RepairShop.class);
			
			shop = shopDao.save(shop);
			return Collections.singletonMap("shop upadated", shop);
		}
		return Collections.singletonMap("shop failed to update", 0);
	}
	

	//edit service
	public Map<String, Object> editService(int servieId, ServicePlanDTO servicePlanDto) {
		if(servicePlanDao.existsById(servieId)) {
			servicePlanDto.setId(servieId);
			
			ServicePlan service=modelMapper.map(servicePlanDto, ServicePlan.class);
			
			service = servicePlanDao.save(service);
			return Collections.singletonMap("service upadated", service);
		}
		return Collections.singletonMap("service failed to update", 0);
	}
	
	//getshopById
	public Optional<RepairShop> getShopById(int shopId) {
		
		Optional<RepairShop> shop = shopDao.findById(shopId);
		if (shop != null) {
		
			return shop;
		} else
			return null;
	}
	
	
	
	
	//delete model
		
	public Map<String, Object> deleteModel(int modelId) {
		if(makeModelDao.existsById(modelId)) {
			makeModelDao.deleteById(modelId);
			return Collections.singletonMap("Model deleted", 1);
		}
		return Collections.singletonMap("failed to delete model", 0);
	}

	
	//get all user
		public List<UserDTO> getUser() 
		{
			List<UserDTO>  userDtoList = new ArrayList<>();
			UserDTO userDto = new UserDTO();
			List<User> list = userdao.findAll();
			
			for(User u: list) {
				userDto= modelMapper.map(u, UserDTO.class);
				userDtoList.add(userDto);
				System.out.println(u);
			}
			
			return userDtoList;
		}
		
}
