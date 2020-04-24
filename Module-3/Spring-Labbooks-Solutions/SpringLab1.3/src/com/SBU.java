package com;

import java.util.List;

public class SBU {
	private int sbuId;
	private String sbuName;
	private String sbuHead;
	private List<Employee> employees;
	
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	public int getSbuId() {
		return sbuId;
	}
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
public void getSbuDetails()
{
	System.out.println("Sbu Id :"+sbuId);
	System.out.println("Sbu Name :"+sbuName);
	System.out.println("Sbu head :"+sbuHead);
	System.out.println("=========================Employee details========================");
	System.out.println("Employee :"+employees);
}

	

}
