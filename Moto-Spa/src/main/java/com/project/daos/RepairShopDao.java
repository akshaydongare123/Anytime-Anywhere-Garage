package com.project.daos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.project.entities.RepairShop;

public interface RepairShopDao extends JpaRepository<RepairShop, Integer> {
	
	@Query(value= "select *from repair_shop where city=?;", nativeQuery = true)
	List<RepairShop> findShopByCity(String city);
}


/*
 * @Query(value = "select *from courses where courseid=?;", nativeQuery = true)
	public List<Courses> findAllCoursesByCoursesId(int courseid);
*/
//shop_name  | shop_email | contact    | city     | address      | details | rating