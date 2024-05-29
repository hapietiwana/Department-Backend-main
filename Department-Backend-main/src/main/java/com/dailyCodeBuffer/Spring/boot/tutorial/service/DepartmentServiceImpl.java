package com.dailyCodeBuffer.Spring.boot.tutorial.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dailyCodeBuffer.Spring.boot.tutorial.entity.Department;
import com.dailyCodeBuffer.Spring.boot.tutorial.error.DepartmentNotFoundException;
import com.dailyCodeBuffer.Spring.boot.tutorial.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	@Override
	public Department SaveDept(Department department) {
		return departmentRepository.save(department);
	}
	@Override
	public List<Department> fetchDepartmentList() {
		return departmentRepository.findAll();
	}
	
	@Override
	public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException {
		Optional<Department> department= departmentRepository.findById(id);
		
		if(!department.isPresent()) {
			throw new DepartmentNotFoundException("Department Not Available");
		}
		
		return department.get();

	}
	@Override
	public Department updateDept(Long departmentId, Department updatedDept) {
		Department dpDB=departmentRepository.findById(departmentId).get();
		
		if(Objects.nonNull(dpDB.getDeptName())) {
			dpDB.setDeptName(updatedDept.getDeptName());
		}
		
		if(Objects.nonNull(dpDB.getDeptAddress())) {
			dpDB.setDeptAddress(updatedDept.getDeptAddress());
		}
		
		if(Objects.nonNull(dpDB.getDeptName())) {
			dpDB.setDeptName(updatedDept.getDeptName());
		}
		return departmentRepository.save(dpDB);
		
	}
	

}
