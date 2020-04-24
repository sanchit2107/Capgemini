package com.main;

import com.bean.Author;
import com.dao.AuthorDao;

public class AuthorMain {

	public static void main(String[] args) {

		AuthorDao authorDao = new AuthorDao();
		
//		String result1 = authorDao.createAuthor(new Author(101, "Akhilesh", "Kumar", "Srivastava", "9587747893"));
//		String result2 = authorDao.createAuthor(new Author(102, "Manoj", "Kumar", "Singh", "78896352410"));
//		String result3 = authorDao.createAuthor(new Author(103, "Saroj", "Kumari", "Jain", "9587453210"));
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
		
//		String resultDelete = authorDao.deleteAuthor(103);
//		System.out.println(resultDelete);
		
		String resultUpdate = authorDao.updateAuthor(101, "Akhilesh", "Kumar", "Pathak", "7770001233");
		System.out.println(resultUpdate);

	}

}
