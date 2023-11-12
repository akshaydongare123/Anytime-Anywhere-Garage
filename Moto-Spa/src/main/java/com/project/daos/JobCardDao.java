package com.project.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.JobCard;

public interface JobCardDao extends JpaRepository<JobCard, Integer> {
	
	List<JobCard> getByUserId(int UserId);
	JobCard getJobCardByUserId(int userId);
}
