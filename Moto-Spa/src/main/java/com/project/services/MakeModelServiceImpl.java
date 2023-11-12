package com.project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.daos.MakeModelDao;
import com.project.dtos.MakeModelDTO;
import com.project.dtos.RepairShopDTO;
import com.project.entities.MakeModel;
import com.project.entities.RepairShop;

@Transactional
@Service
public class MakeModelServiceImpl {

	@Autowired
	private MakeModelDao makeModelDao;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public List<MakeModelDTO> getAllMake() 
	{
		List<MakeModelDTO> makeDtoList = new ArrayList<>();
		MakeModelDTO  makeDto = new MakeModelDTO();
		List<MakeModel> list = makeModelDao.findAll();
		
		for(MakeModel m : list) {
			makeDto= modelMapper.map(m, MakeModelDTO.class);
			makeDtoList.add(makeDto);
		}
		return makeDtoList;
	}
	
	
	public List<MakeModelDTO> getModelByMake(String make) 
	{
		List<MakeModelDTO> modelDtoList = new ArrayList<>();
		MakeModelDTO  modelDto = new MakeModelDTO();
		List<MakeModel> modelList = makeModelDao.findModelByMake(make);
		
		for(MakeModel m : modelList) {
			modelDto= modelMapper.map(m, MakeModelDTO.class);
			modelDtoList.add(modelDto);
		}
		return modelDtoList;
	}
	
	public Optional<MakeModel> getModelById(int modelId) {
		
		Optional<MakeModel> makeModel = makeModelDao.findById(modelId);
		if (makeModel != null) {
		
			return makeModel;
		} else
			return null;
	}
	
	//edit add remove models
}
