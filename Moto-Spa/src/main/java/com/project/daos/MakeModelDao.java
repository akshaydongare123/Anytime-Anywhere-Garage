package com.project.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entities.MakeModel;

public interface MakeModelDao extends JpaRepository<MakeModel, Integer> {
		
	@Query(value = "select *from make_model where make_name=?;", nativeQuery = true  )
		List<MakeModel> findModelByMake(String make);
}
