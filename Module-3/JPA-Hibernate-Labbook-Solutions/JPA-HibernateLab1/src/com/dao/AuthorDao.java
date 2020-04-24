package com.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.bean.Author;
import com.config.MyFactory;

public class AuthorDao {
	
	EntityManager em = MyFactory.getEntityManager();
	
	public String createAuthor(Author a) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(a);
		tx.commit();
		return "Author Saved!! And successfully created new Author..";
	}
	
	public Author getAuthor(int aID) {
		
		Author a = em.find(Author.class, aID);
		return a;
	}
	
	public String deleteAuthor(int aID) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Author a = em.find(Author.class, aID);
		em.remove(a);
		tx.commit();
		return "Author with AuthorID- "+ aID + " is removed!!";
	}
	
	public String updateAuthor(int aID, String firstName, String middleName, String lastName, String phoneNumber) {
		
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Author a = em.find(Author.class, aID);
		if(a!=null) {
			a.setFirstName(firstName);
			a.setLastName(lastName);
			a.setMiddleName(middleName);
			a.setPhoneNumber(phoneNumber);
			em.persist(a);
			tx.commit();
			return "Author updated succesfully!!";
		}
		else {
			return "Author Not found!!";
		}
	}
	
} 
