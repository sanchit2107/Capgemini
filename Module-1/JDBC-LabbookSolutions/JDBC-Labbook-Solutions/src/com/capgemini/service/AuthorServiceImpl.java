package com.capgemini.service;

import com.capgemini.dao.AuthorDao;
import com.capgemini.dao.AuthorDaoImpl;
import com.capgemini.entities.Author;

public class AuthorServiceImpl implements AuthorService{
	AuthorDao dao=new AuthorDaoImpl();
	@Override
	public String insertAuthor(Author a) {
		return dao.insertAuthor(a);
		
	}
	
	@Override
	public String updateAuthor(String a, double price) {
		return dao.updateAuthor(a, price);
		
	}

	@Override
	public String deleteAuthorById(Long authorId) {
		return dao.deleteAuthorById(authorId);
	}

	@Override
	public Author findAuthorById(Long authorId) {
		return dao.findAuthorById(authorId);
	}


}
