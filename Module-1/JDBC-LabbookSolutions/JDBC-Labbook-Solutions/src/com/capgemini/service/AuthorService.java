package com.capgemini.service;

import com.capgemini.entities.Author;

public interface AuthorService
{
	
	public String insertAuthor(Author a);
	public String updateAuthor(String a,double price);


	String deleteAuthorById(Long authorId);
	Author findAuthorById(Long authorId);
	
	
}
