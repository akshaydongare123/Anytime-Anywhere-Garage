package com.project.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.daos.MakeModelDao;
import com.project.daos.VehicleDao;
import com.project.dtos.VehicleDTO;
import com.project.entities.MakeModel;
import com.project.entities.Vehicle;

@Transactional
@Service
public class VehicleServiceImpl {

	@Autowired
	private VehicleDao vehicleDao;
	
	@Autowired
	private MakeModelDao makeModelDao;
	
	@Autowired
	private ModelMapper modelMapper;

	public List<VehicleDTO> getAllVehicles() 
	{
		List<VehicleDTO> vehicleDtoList = new ArrayList<>();
		VehicleDTO vehicleDto = new VehicleDTO();
		List<Vehicle> list = vehicleDao.findAll();
		
		for(Vehicle v : list) {
			vehicleDto= modelMapper.map(v, VehicleDTO.class);
			vehicleDtoList.add(vehicleDto);
		}
		return vehicleDtoList;
	}
	
	public Optional<Vehicle> getVehicleById(int vehicleId) {
		
		Optional<Vehicle> vehicle= vehicleDao.findById(vehicleId);
		if (vehicle != null) {
		
			return vehicle;
		} else
			return null;
	}
	
	

	

}





//public Map<String,Object> editChapter(int id,CoursesChapterDto chapterDto){
//if(courseschapterdao.existsById(id)) {
//	CoursesChapterDto chapter = findChapterById(id);
//	CourseChapter updateChapter = converter.toCourseChapterEntity(chapter);
//	updateChapter.setChapterTitle(chapterDto.getChapterTitle());
//	updateChapter.setNumOfVideo(chapterDto.getNumOfVideo());
//	updateChapter.setCourseChapterid(chapterDto.getCourseChapterid());
//	
//	updateChapter = courseschapterdao.save(updateChapter);
//	return Collections.singletonMap("changeRows", 1);
//}
//return Collections.singletonMap("changedRows", 0);
//

///add, update, remove VEHICLE
	
	