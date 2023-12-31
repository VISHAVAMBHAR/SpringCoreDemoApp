package com.demo1;

public class Department {
	
	private int dptId;
	private String dptName;
	public Department() {

	}
	public int getDptId() {
		return dptId;
	}
	public void setDptId(int dptId) {
		this.dptId = dptId;
	}
	public String getDptName() {
		return dptName;
	}
	public void setDptName(String dptName) {
		this.dptName = dptName;
	}
	@Override
	public String toString() {
		return "Department [dptId=" + dptId + ", dptName=" + dptName + "]";
	}
	
	

}
