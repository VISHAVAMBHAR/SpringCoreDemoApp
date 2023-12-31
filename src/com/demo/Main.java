package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		//Employee enp=new Employee();
		ApplicationContext app=new ClassPathXmlApplicationContext("NewFile.xml");
		
		Employee emp1=(Employee) app.getBean("emp1");
		Employee emp2=(Employee) app.getBean("emp2");
		Employee emp3=(Employee) app.getBean("emp3");
		System.out.println("emp1");
		System.out.println(emp1);
		System.out.println("emp2");
		System.out.println(emp2);
		System.out.println("emp3");
		System.out.println(emp3);
		
		ApplicationContext app1=new ClassPathXmlApplicationContext("NewFile1.xml");
		Department dep1=(Department) app1.getBean("dep1");
		Department dep2=(Department) app1.getBean("dep2");
		System.out.println("dep1");
		System.out.println(dep1);
		
		System.out.println("dep2");
		System.out.println(dep2);
		System.out.println("Completed");

	}

}
