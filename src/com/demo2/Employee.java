package com.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.demo2.Department;

public class Employee {
	
	private int empId;
	private String empName;
	@Autowired 
	//@Qualifier("dep1")
	@Qualifier("dep2")
	private Department department;
	public Employee() {

	}
	//@Autowired
	public Employee(Department department) {
		System.out.println("costructor injection");
		this.department = department;
	}


	public Employee(int empId, String empName, Department department) {
 
		this.empId = empId;
		this.empName = empName;
		this.department = department;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	//@Autowired
	public void setDepartment(Department department) {
		System.out.println("Setter injection");
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
	}
	

}
