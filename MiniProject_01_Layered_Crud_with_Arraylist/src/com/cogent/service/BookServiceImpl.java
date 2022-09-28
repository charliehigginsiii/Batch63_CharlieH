package com.cogent.service;

import java.util.List;

import com.cogent.bean.BookBean;
import com.cogent.repo.BookRepo;
import com.cogent.repo.BookRepoImpl;

public class BookServiceImpl implements BookService {
	BookRepo bookRepo=new BookRepoImpl();
	@Override
	public void addBook(BookBean bookBean) {
		bookRepo.addBook(bookBean);
		
	}

	@Override
	public void deleteBookById(int bookId) {
		bookRepo.deleteBookById(bookId);
		
	}

	@Override
	public BookBean findBookById(int bookId) {
		// TODO Auto-generated method stub
		return bookRepo.findBookById(bookId);
	}

	@Override
	public BookBean findBookByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepo.findBookByAuthor(author);
	}

	@Override
	public List<BookBean> findBookwithPriceRange(double minPrice, double maxPrice) {
		// TODO Auto-generated method stub
		return bookRepo.findBookwithPriceRange(minPrice, maxPrice);
	}

	

}
