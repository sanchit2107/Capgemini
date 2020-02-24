package com.capgemini.entities;

public class Author {
	private Long authorId;
	private String firstName;
	private String lastName;
	private String middleName;
	private long phoneNo;
	
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public Author(String firstName,String middleName,String lastName,long phoneNo) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.middleName=middleName;
		this.phoneNo=phoneNo;
	}
	public Author() {
		
	}

}
