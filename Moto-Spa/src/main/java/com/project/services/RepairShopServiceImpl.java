package com.project.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.daos.RepairShopDao;
import com.project.dtos.RepairShopDTO;
import com.project.dtos.VehicleDTO;
import com.project.entities.RepairShop;
import com.project.entities.Vehicle;

@Transactional
@Service
public class RepairShopServiceImpl {

	@Autowired
	private RepairShopDao repairShopDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<RepairShopDTO> getAllShops() 
	{
		List<RepairShopDTO>  shopDtoList = new ArrayList<>();
		RepairShopDTO shopDto = new RepairShopDTO();
		List<RepairShop> list = repairShopDao.findAll();
		
		for(RepairShop rp : list) {
			shopDto= modelMapper.map(rp, RepairShopDTO.class);
			shopDtoList.add(shopDto);
		}
		return shopDtoList;
	}
	
	public List<RepairShopDTO> getShopsByCity(String city){
		List<RepairShopDTO>  shopDtoList = new ArrayList<>();
		RepairShopDTO shopDto = new RepairShopDTO();
		
		List<RepairShop> shopsCity= repairShopDao.findShopByCity(city);
		
		for(RepairShop rp: shopsCity) {
			shopDto= modelMapper.map(rp, RepairShopDTO.class);
			shopDtoList.add(shopDto);
		}
		return shopDtoList;
	}
	
	
	
	
	
}
