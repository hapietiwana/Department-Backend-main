package com.dailyCodeBuffer.Spring.boot.tutorial.service;

import java.util.List;

import com.dailyCodeBuffer.Spring.boot.tutorial.entity.Department;
import com.dailyCodeBuffer.Spring.boot.tutorial.error.DepartmentNotFoundException;

public interface DepartmentService {


	public Department SaveDept(Department department);

	public List<Department> fetchDepartmentList();
	
	public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;
	
	public Department updateDept(Long id,Department updatedDept);


}
