package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.ServicePlan;

public interface ServicePlanDao extends JpaRepository<ServicePlan, Integer> {
	
}
