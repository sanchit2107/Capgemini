package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.bean.Employee;

public interface EmployeeDao {

	public Employee addEmployee(Employee e);

	public String removeEmployee(int empid);

	public Employee findById(int empid);

	public List<Employee> allEmployee();

}
