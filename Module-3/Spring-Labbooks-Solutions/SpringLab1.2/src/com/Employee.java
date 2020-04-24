package com;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;
	private SBU sbu;
	
	public SBU getSbu() {
		return sbu;
	}
	public void setSbu(SBU sbu) {
		this.sbu = sbu;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getBusinessUnit() {
		return businessUnit;
	}
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void getEmployeeDetails()
	{
		System.out.println("Employee Id:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Employee BusinessUnit:"+businessUnit);
		System.out.println("Employee Age:"+age);
	
	}
	
	
	public void getSbuDetails()
	{
		System.out.println("Sbu Id :"+sbu.getSbuId());
		System.out.println("Sbu Head :"+sbu.getSbuHead());
		System.out.println("Sbu Name :"+sbu.getSbuName());
		sbu.toString();
	}

}
