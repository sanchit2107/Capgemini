package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

public class EmployeeMain {
	public static void main(String args[])
	{
		ApplicationContext ctx=new ClassPathXmlApplicationContext("Bean.xml");
		EmployeeService es=(EmployeeService) ctx.getBean("employeeService");
		es.addEmployee(new Employee(103, "yADAV", 96000));
		System.out.println(es.allEmployee());
	}

}
