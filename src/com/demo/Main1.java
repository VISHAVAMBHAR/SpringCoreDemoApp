package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

	public static void main(String[] args) {

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
