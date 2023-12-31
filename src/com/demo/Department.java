package com.demo;

public class Department {
	private int depId;
	private String depName;
	private String depLoc;

	public Department() {
	System.out.println("Department object created");	
	}
	
	
	public Department(int depId, String depName, String depLoc) {
		this.depId = depId;
		this.depName = depName;
		this.depLoc = depLoc;
	}


	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + ", depLoc=" + depLoc + "]";
	}
	

}
