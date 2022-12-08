package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {

		ApplicationContext Ac = new ClassPathXmlApplicationContext("context.xml");
		Employee emp = (Employee) Ac.getBean("gs");
		System.out.println(emp);

	}

}
