package com.demo;

public class Employee {
	
	private int empId;
	private String empName;
	private String empDep;
	
	private Department department;

	public Employee() {
		System.out.println("object of Employee created");
	}

	public Employee(int empId) {
		super();
		this.empId = empId;
	}

	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}

	public Employee(int empId, String empName, String empDep,Department department) {
		this(empId,empName);
		this.empDep = empDep;
		this.department=department;
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

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDep=" + empDep + ", department=" + department
				+ "]";
	}

	
	
	
}
