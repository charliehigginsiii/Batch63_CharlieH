package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.BookBean;

public class BookRepoImpl implements BookRepo {
	ArrayList<BookBean> Books=new ArrayList();
	{
		Books.add(new BookBean(1,"Tornado Book","Charlie",5.80));
		Books.add(new BookBean(2,"How to Cook Chicken","Nathen",7.60));
		Books.add(new BookBean(3,"Covid-19","Joe",17.50));
	}
	@Override
	public void addBook(BookBean bookBean) {
		Books.add(bookBean);
	}

	@Override
	public void deleteBookById(int bookId) {
		for(int i=0;i<Books.size();i++) {
			if(Books.get(i).getBookId()==bookId) {
				Books.remove(i);
			}
		}
	}
	@Override
	public BookBean findBookById(int bookId) {
		BookBean Book=null;
		for(int i=0;i<Books.size();i++) {
			if(Books.get(i).getBookId()==bookId) {
				Book=Books.get(i);
				break;
			}
		}
		return Book;
	}
	@Override
	public BookBean findBookByAuthor(String author) {
		BookBean Book=null;
		for(int i=0;i<Books.size();i++) {
			if(Books.get(i).getBookAuthor().contentEquals(author)) {
				Book=Books.get(i);
				break;
			}
		}
		return Book;
	}

	@Override
	public List<BookBean> findBookwithPriceRange(double minPrice, double maxPrice) {
		List<BookBean>BookList=new ArrayList();
		for(int i=0;i<Books.size();i++) {
			if(Books.get(i).getPrice()>=minPrice&&Books.get(i).getPrice()<=maxPrice) {
				BookList.add(Books.get(i));
			}
		}
		return BookList;
	}

}
