package com.capgemini.main;


import java.util.Scanner;

import com.capgemini.entities.Author;
import com.capgemini.service.AuthorService;
import com.capgemini.service.AuthorServiceImpl;




public class AuthorMain {
	public static void main(String [] args) {
		AuthorService as=new AuthorServiceImpl();
		Scanner s=new Scanner(System.in);
		while(true) {
		
		System.out.println("1 Insert Author ");
		System.out.println("2 Find Author by Id");
		System.out.println("3 Update Author");
		System.out.println("4 Delete Author");
		System.out.println("5 exit");
		System.out.println("Enter Choice");
		int ch=s.nextInt();
		switch(ch){
		
		case 1: 
			System.out.println("Enter first Name");
			String fname=s.next();
			System.out.println("Enter Middle Name");
			String mname=s.next();
			System.out.println("Enter Last Name");
			String lname=s.next();
			System.out.println("Enter phone number");
			Long pno=s.nextLong();
			Author a1=new Author(fname,mname,lname,pno);
			String result=as.insertAuthor(a1);
			System.out.println(result);
			break;
			
		case 2: 
			System.out.println("Enter Author ID");
			Long aid=s.nextLong();
			Author au=as.findAuthorById(aid);
			if(au!=null)
				System.out.println(au.getFirstName()+"\t"+au.getMiddleName()+"\t"+au.getLastName()+"\t"+au.getPhoneNo());
			else
				System.out.println("Author Not available");
			break;
		case 3:;
			System.out.println("Enter author name:");
			String authname = s.next() ;
			System.out.println("Enter new Price:");
			double price = s.nextDouble() ;
			String result1=as.updateAuthor(authname, price) ;
			System.out.println(result1);
			
			break ;
		case 4:
			System.out.println("Enter author id:");
			long authid = s.nextLong() ;
			as.deleteAuthorById(authid) ;
			break ;
		case 5: 
			System.exit(0);
		default:
			System.out.println("Invalid option selected");	
		} 
	}
	}
}
