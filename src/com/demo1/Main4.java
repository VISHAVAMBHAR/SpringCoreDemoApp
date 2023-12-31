package com.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("NewFile3.xml");
		
		Employee emp1=(Employee) context.getBean("emp1");
		Department dep1=(Department) context.getBean("dep1");
		
		System.out.println("emp1");
		System.out.println(emp1);
		System.out.println("dep1");
		System.out.println(dep1);
	}

}
