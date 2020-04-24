package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
@Service
public class EmployeeService {
	@Autowired
	EmployeeDao edao;

	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		if (e == null) {
			return null;
		} else {
			return edao.addEmployee(e);
		}

	}

	public String removeEmployee(int empid) {
		// TODO Auto-generated method stub
		if (empid == 0) {
			return "Empoyee not found";
		} else {
			edao.removeEmployee(empid);
			return "Employee is deleted";
		}
	}

	public Employee findById(int empid) {
		// TODO Auto-generated method stub
		if (empid == 0) {
			return null;
		} else {
			return edao.findById(empid);

		}
	}

	public List<Employee> allEmployee() {
		// TODO Auto-generated method stub
		return edao.allEmployee();
	}

}
