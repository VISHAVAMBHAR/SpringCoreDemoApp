package com.demo.operation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.demo.Employee;

@Component
public class EmployeeCRUD {
	
	List<Employee> emplist= new ArrayList();
	
	public EmployeeCRUD()
	{
		System.out.println("EmployeeCRUD object created");
	}
	
	public void addEmployee(Employee emp)
	{
		emplist.add(emp);
		System.out.println("Employee details is added ");
	}
	
	public void showEmployeeList()
	{
		for(Employee employee : emplist)
		{
			System.out.println(employee);
		}
	}

}
