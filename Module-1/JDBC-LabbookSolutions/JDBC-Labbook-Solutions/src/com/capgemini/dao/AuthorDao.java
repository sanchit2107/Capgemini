package com.capgemini.dao;

import com.capgemini.entities.Author;

public interface AuthorDao {
	public String insertAuthor(Author a);
	public String updateAuthor(String a,double price);
	public String deleteAuthorById(Long authorId);
	public Author findAuthorById(Long authorId);

}
