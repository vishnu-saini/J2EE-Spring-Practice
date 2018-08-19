/*
 * 
 */
package com.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class BookServiceImp.
 */
public class BookServiceImp implements BookService {

	/** The books. */
	private static Map<Integer, Book> books = new HashMap<Integer, Book>();
	static {
		books.put(1, new Book(121, "ABC123", "head first", "katthy", 500.00));
		books.put(2, new Book(11, "ABU123", "head last", "amit", 400.00));
	}

	/* (non-Javadoc)
	 * @see com.demo.BookService#getAllBooks()
	 */
	@Override
	public List<Book> getAllBooks() {
		return new ArrayList<Book>(books.values());
	}

	/* (non-Javadoc)
	 * @see com.demo.BookService#getBookById(int)
	 */
	@Override
	public Book getBookById(int bookId) {
		return books.get(bookId);
	}

	/* (non-Javadoc)
	 * @see com.demo.BookService#addBook(com.demo.Book)
	 */
	@Override
	public Book addBook(Book book) {
		book.setId(books.size() + 1);
		books.put(book.getId(), book);
		return book;
	}

	/* (non-Javadoc)
	 * @see com.demo.BookService#updateBook(com.demo.Book)
	 */
	@Override
	public Book updateBook(Book book) {
		if (book.getId() <= 0)
			return null;
		else
			books.put(book.getId(), book);
		return book;
	}

	/* (non-Javadoc)
	 * @see com.demo.BookService#removeBook(int)
	 */
	@Override
	public Book removeBook(int bookId) {
		return books.remove(bookId);
	}

}