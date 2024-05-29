package com.dailyCodeBuffer.Spring.boot.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dailyCodeBuffer.Spring.boot.tutorial.entity.Department;
import com.dailyCodeBuffer.Spring.boot.tutorial.error.DepartmentNotFoundException;
import com.dailyCodeBuffer.Spring.boot.tutorial.service.DepartmentService;

import jakarta.validation.Valid;

@RestController
public class DepartmentController {
	
    @Autowired
	private DepartmentService departmentservice;
	
    
    
	@PostMapping("/departments")
	public Department SaveDept(@Valid @RequestBody  Department department) {
		return departmentservice.SaveDept(department);
	}
	
	@GetMapping("/departments")
	public List<Department> fetchDepartmentList(){
		return departmentservice.fetchDepartmentList();
	}
	@GetMapping("/departments/{id}") 
	public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFoundException {
    	return departmentservice.fetchDepartmentById(departmentId);
    }
	
	@PutMapping("/departments/{id}")
	public Department updateDept(@PathVariable("id") Long departmentId,@RequestBody Department updatedDept) {
		    return departmentservice.updateDept(departmentId,updatedDept);
		
	}
	/*
	@GetMapping("/departments/name/{name}")
	public Department fetchDepartmentById(@PathVariable("name") String departmentName) {
		return departmentservice.fetchDepartmentByName(departmentName);
	}
	*/
}
