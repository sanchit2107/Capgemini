package com.cg.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.bean.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao{
private List<Employee> lists=new ArrayList<>();
public EmployeeDaoImpl() {
	// TODO Auto-generated constructor stub
	lists.add(new Employee(101, "RAmesh", 56000));
	lists.add(new Employee(102, "Mahesh", 620000));
	
	
}
	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		lists.add(e);
		return e;
	}

	@Override
	public String removeEmployee(int empid) {
		// TODO Auto-generated method stub
		if(empid !=0)
		{
			lists.remove(empid);
		}
		return null;
	}

	@Override
	public Employee findById(int empid) {
		// TODO Auto-generated method stub
		Employee e1=lists.get(empid);
		return e1;
	}

	@Override
	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return lists;
	}

}
