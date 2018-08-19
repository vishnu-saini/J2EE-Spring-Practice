/*
 * 
 */
package com.demo;

import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Interface BookService.
 */
public interface BookService {
	
	/**
	 * Gets the all books.
	 *
	 * @return the all books
	 */
	public List<Book> getAllBooks();
	
	/**
	 * Gets the book by id.
	 *
	 * @param bookId the book id
	 * @return the book by id
	 */
	public Book getBookById(int bookId);
	
	/**
	 * Adds the book.
	 *
	 * @param book the book
	 * @return the book
	 */
	public Book addBook(Book book);
	
	/**
	 * Update book.
	 *
	 * @param book the book
	 * @return the book
	 */
	public Book updateBook(Book book);
	
	/**
	 * Removes the book.
	 *
	 * @param bookId the book id
	 * @return the book
	 */
	public Book removeBook(int bookId);
}