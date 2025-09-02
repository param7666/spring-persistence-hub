package com.liabrary.runner;

import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.liabrary.controller.BookController;
import com.liabrary.model.Book;
@Component
public class BookRunner implements CommandLineRunner {
	@Autowired
	private BookController bcon;
	@Override
	public void run(String... args) throws Exception {
		
		try(Scanner sc=new Scanner(System.in)) {
			System.out.println("1)ADD NEW BOOK");
			System.out.println("2) RETRIVE ALL BOOKS");
			System.out.println("3) FIND A BOOK BY ID");
			System.out.println("4) DELETE A BOOK BY ID");
			System.out.println("5) EXIT");
			System.out.println("========================");
			System.out.println("ENTER YOUR CHOICE");
			int choice=sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("Enter Book Name");
				String name=sc.nextLine();
				System.out.println("Enter Author Name");
				String aname=sc.nextLine();
				System.out.println("Enter Book Price");
				double price=sc.nextDouble();
				sc.nextLine();
				Book b=new Book(name, aname, price);
				bcon.addBooks(b);
				System.out.println("Book Added");
				break;
			}
			case 2: {
				Iterable<Book> allBooks=bcon.retriveAllBook();
				allBooks.forEach(b->System.out.println(b));
				break;
			}
			case 3: {
				System.out.println("Enter Book ID");
				int id=sc.nextInt();
				Optional<Book> book=bcon.getBookById(id);
				System.out.println(book);
				break;
			}
			case 4: {
				System.out.println("Enter Book Id");
				int id=sc.nextInt();
				bcon.deleteBookById(id);
				System.out.println("Book Deleted");
				break;
			}
			case 5: {
				System.exit(0);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
