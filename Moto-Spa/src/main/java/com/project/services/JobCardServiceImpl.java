package com.project.services;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.daos.JobCardDao;
import com.project.dtos.JobCardDTO;
import com.project.entities.JobCard;

@Transactional
@Service
public class JobCardServiceImpl {

	@Autowired
	private JobCardDao jobCardDao;

	@Autowired
	private ModelMapper modelMapper;

	//add jobcart
//	public JobCard booking(JobCardDTO jobcardDTO) {
//
//		JobCard jCard = modelMapper.map(jobcardDTO, JobCard.class);
//		jobCardDao.save(jCard);
//		return jCard;
//	}
//
//	public JobCardDTO getJobCardByUserId(int userId) {
//		JobCard jCard = jobCardDao.getJobCardByUserId(userId);
//		return modelMapper.map(jCard, JobCardDTO.class);
//	}

	
	//add jobcart
		public JobCard booking(JobCardDTO jobcardDTO) {
			JobCard jCard = modelMapper.map(jobcardDTO, JobCard.class);
		
			jobCardDao.save(jCard);
			return jCard;
		}

		public JobCardDTO getJobCardByUserId(int id) {
			JobCard jCard = jobCardDao.getById(id);
			return modelMapper.map(jCard, JobCardDTO.class);
		}

}

/*
 * public Map<String,Object> addCourses(CoursesDto coursesDto){ Courses
 * courses=converter.toCoursesEntity(coursesDto);
 * System.out.println(courses.toString()); User u1=
 * userdao.findById(coursesDto.getUser_id()); u1.addCourses(courses); courses =
 * coursesdao.save(courses);
 * 
 * return Collections.singletonMap("insertedId", courses.getCourseid()); }
 */
