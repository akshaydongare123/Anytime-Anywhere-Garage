package com.project.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.dtos.JobCardDTO;
import com.project.dtos.Response;
import com.project.services.JobCardServiceImpl;

@CrossOrigin
@RestController
public class JobCardController {
	
	@Autowired
	private JobCardServiceImpl jobCardService;
	
//	@GetMapping("/jobcard/{user_id}")
//	public ResponseEntity<?> findJobCardByUserId(@PathVariable("user_id") int id){
//		JobCardDTO jCard= jobCardService.getJobCardByUserId(id);
//		return Response.success(jCard);
//	}
	
	@GetMapping("/jobcard/{id}")
	public ResponseEntity<?> findJobCardByUserId(@PathVariable("id") int id){
		JobCardDTO jCard= jobCardService.getJobCardByUserId(id);
		return Response.success(jCard);
	}
	
	@PostMapping("/addjobcard")
	public ResponseEntity<?> addJobcard(@RequestBody JobCardDTO jCard) {
		return ResponseEntity.ok(jobCardService.booking(jCard));
	}

}
