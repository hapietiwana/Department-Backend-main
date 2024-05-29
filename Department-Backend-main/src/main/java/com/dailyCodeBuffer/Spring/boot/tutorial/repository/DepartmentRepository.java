package com.dailyCodeBuffer.Spring.boot.tutorial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dailyCodeBuffer.Spring.boot.tutorial.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {

	//public Department findByDepartmentName(String departmentName);


}
