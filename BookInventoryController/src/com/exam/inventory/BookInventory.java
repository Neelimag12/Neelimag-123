package com.exam.inventory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.exam.exception.BookAlreadyIssuedException;
import com.exam.exception.ISBNAlreadyExistsException;
import com.exam.exception.ISBNDoesNotExistsException;
import com.exam.model.Book;
import com.exam.model.BookIssue;

public class BookInventory {
	public List<Book> books = new ArrayList<>();
	public List<BookIssue> issuedBooks = new ArrayList<>();

	public boolean addBook(Book book) {
		return false;
	}

	public boolean issueBook(String isbn, String studentName) {
		return false;

	}

	public List<Book> showInventory() {
		return null;
	}

	public List<BookIssue> showIssuedBooks() {
		return null;
	}


}
