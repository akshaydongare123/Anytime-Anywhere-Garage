package com.project.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.entities.Vehicle;

public interface VehicleDao extends JpaRepository<Vehicle, Integer> {
	
}
