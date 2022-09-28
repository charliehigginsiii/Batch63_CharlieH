package com.cogent.client;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cogent.bean.BookBean;
import com.cogent.service.BookService;
import com.cogent.service.BookServiceImpl;

public class BookLibrary {
	public static void main(String[]args) {
		BookService service=new BookServiceImpl();
		boolean runprogram=true;
		while(runprogram) {
			for(int i=0;i<79;i++) {
				if(i<36) {
					System.out.print("* ");
				}else if(i>=36&&i<37) {
					System.out.println();
					System.out.println("Book Library");
				}else if(i>=37&&i<73) {
					System.out.print("* ");
				}else if(i==73) {
					System.out.println();
					System.out.println("1. Add Book");
				}else if(i==74) {
					System.out.println("2. Delete Book");
				}else if(i==75) {
					System.out.println("3. Search Book by Id");
				}else if(i==76) {
					System.out.println("4. Search Book By Author");
				}else if(i==77) {
					System.out.println("5. Get Books with Price Range");
				}else if(i==78) {
					System.out.println("6. Exit");
				}
			}
			System.out.println("Enter Number: ");
			int number=new Scanner(System.in).nextInt();
			if(number==1) {
				System.out.println("Enter Book Id: ");
				int bookId=new Scanner(System.in).nextInt();
				System.out.println("Enter Book Title: ");
				String bookTitle=new Scanner(System.in).nextLine();
				System.out.println("Enter Book Author: ");
				String bookAuthor=new Scanner(System.in).nextLine();
				System.out.println("Enter Book Price: ");
				double bookPrice=new Scanner(System.in).nextDouble();
				service.addBook(new BookBean(bookId, bookTitle, bookAuthor, bookPrice));
			}else if(number==2) {
				System.out.println("Enter Book Id: ");
				int bookId=new Scanner(System.in).nextInt();
				service.deleteBookById(bookId);
			}else if (number==3) {
				System.out.println("Enter Book ID: ");
				int id=new Scanner(System.in).nextInt();
				BookBean book=service.findBookById(id);
				System.out.print("Id: "+book.getBookId()+" ");
				System.out.print("Title: "+book.getBookTitle()+" ");
				System.out.print("Author: "+book.getBookAuthor()+" ");
				System.out.print("Price: $"+book.getPrice());
				System.out.println();
			}else if(number==4) {
				System.out.println("Enter Book ID: ");
				String author=new Scanner(System.in).nextLine();
				BookBean book=service.findBookByAuthor(author);
				System.out.print("Id: "+book.getBookId()+" ");
				System.out.print("Title: "+book.getBookTitle()+" ");
				System.out.print("Author: "+book.getBookAuthor()+" ");
				System.out.print("Price: $"+book.getPrice());
				System.out.println();
				System.out.println("Do you want to search more?Y or N");
			}
			else if(number==5) {
				System.out.println("Enter Minimum Price: ");
				double minPrice=new Scanner(System.in).nextDouble();
				System.out.println("Enter Maximum Price: ");
				double maxPrice=new Scanner(System.in).nextDouble();
				List<BookBean> BookList=service.findBookwithPriceRange(minPrice,maxPrice);
				for(int i=0;i<BookList.size();i++) {
					System.out.println("Book Id: "+BookList.get(i).getBookId()+", Book Title: "+BookList.get(i).getBookTitle()
							+", Book Author: "+BookList.get(i).getBookAuthor()+", Book Price: $"+BookList.get(i).getPrice());
				}
			}
			else if(number==6) {
				runprogram=false;
				break;
			
			}
		}
		
	}

}
