package com.project.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project.dtos.MakeModelDTO;
import com.project.dtos.Response;
import com.project.entities.MakeModel;
import com.project.services.MakeModelServiceImpl;

@CrossOrigin
@RestController
public class MakeModelController {
	
	@Autowired
	private MakeModelServiceImpl makeModelService;
	
	
	@GetMapping("/getallmake")
	public ResponseEntity<?> findAllMake(){
		List<MakeModelDTO> makeList= makeModelService.getAllMake();
		return Response.success(makeList);
	}
	
	@GetMapping("/getmodel/{make_name}")
	public ResponseEntity<?> findModelByMake(@PathVariable("make_name")  String Make){
		List<MakeModelDTO> modelList= makeModelService.getModelByMake(Make);
		return Response.success(modelList);
	}
	

	@GetMapping("/findmodel/{id}")
	public ResponseEntity<?> findModelById(@PathVariable("id") int modelId){
		Optional<MakeModel> makeModel= makeModelService.getModelById(modelId);
		return Response.success(makeModel);
	}
	
	
}
