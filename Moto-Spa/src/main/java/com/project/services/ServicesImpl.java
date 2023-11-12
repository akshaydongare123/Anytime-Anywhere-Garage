package com.project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.daos.ServicePlanDao;
import com.project.dtos.ServicePlanDTO;
import com.project.entities.ServicePlan;

@Transactional
@Service
public class ServicesImpl {

	@Autowired
	private ServicePlanDao serviceDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<ServicePlanDTO> getAllServices() 
	{
		List<ServicePlanDTO>  serviceDtoList = new ArrayList<>();
		ServicePlanDTO serviceDto = new ServicePlanDTO();
		List<ServicePlan> list = serviceDao.findAll();
		
		for(ServicePlan sp : list) {
			serviceDto= modelMapper.map(sp, ServicePlanDTO.class);
			serviceDtoList.add(serviceDto);
			System.out.println(sp);
		}
		
		return serviceDtoList;
	}

	public Optional<ServicePlan> getServiceById(int serviceId) {
		
		Optional<ServicePlan> plan = serviceDao.findById(serviceId);
		if (plan != null) {
		
			return plan;
		} else
			return null;
	}

}


