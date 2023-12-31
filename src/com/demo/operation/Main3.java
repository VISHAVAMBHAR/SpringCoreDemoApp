package com.demo.operation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.Employee;

public class Main3 {

	public static void main(String[] args) {
		//Employee enp=new Employee();
		ApplicationContext app2=new ClassPathXmlApplicationContext("NewFile2.xml");
		
		EmployeeCRUD empCRUD=(EmployeeCRUD) app2.getBean(EmployeeCRUD.class);
		
		empCRUD.addEmployee(new Employee(104,"Raksha"));
		empCRUD.showEmployeeList();

	}

}
