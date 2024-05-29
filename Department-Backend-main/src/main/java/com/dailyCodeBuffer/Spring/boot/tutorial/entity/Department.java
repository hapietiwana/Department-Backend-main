package com.dailyCodeBuffer.Spring.boot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long deptID;
	
	@NotBlank(message="Please add Department Name")
	private String deptName;
	private String deptAddress;
	private String DeptCode;

	public long getDeptID() {
		return deptID;
	}

	public void setDeptID(long deptID) {
		this.deptID = deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAddress() {
		return deptAddress;
	}

	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}

	public String getDeptCode() {
		return DeptCode;
	}

	public void setDeptCode(String deptCode) {
		DeptCode = deptCode;
	}

	public Department(long deptID, String deptName, String deptAddress, String deptCode) {
		super();
		this.deptID = deptID;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		DeptCode = deptCode;
	}

	public Department() {

	}

	@Override
	public String toString() {
		return "Department [deptID=" + deptID + ", deptName=" + deptName + ", deptAddress=" + deptAddress
				+ ", DeptCode=" + DeptCode + "]";
	}

}
