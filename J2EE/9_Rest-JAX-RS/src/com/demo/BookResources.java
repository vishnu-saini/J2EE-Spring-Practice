/*
 * Author: Vishnu Saini
 */
package com.demo;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
// TODO: Auto-generated Javadoc

/**
 * The Class BookResources.
 */
@Path("/books")
public class BookResources {
	
	/** The dao. */
	private BookService dao=new BookServiceImp();

	/*@Produces(MediaType.TEXT_PLAIN)
	public String hello(){
		return "hello";
	}*/
	
	/**
	 * Gets the all books.
	 *
	 * @return the all books
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getAllBooks(){
		return dao.getAllBooks();
	}
	
	/**
	 * Gets the book by id.
	 *
	 * @param bookId the book id
	 * @return the book by id
	 */
	@GET
	@Path("/{bookId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book getBookById(@PathParam("bookId") int bookId){
		return dao.getBookById(bookId);
	}
	
	/**
	 * Adds the book.
	 *
	 * @param book the book
	 * @return the book
	 */
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Book addBook(Book book){
		return dao.addBook(book);
		
	}
	
	/**
	 * Update book.
	 *
	 * @param bookId the book id
	 * @param book the book
	 * @return the book
	 */
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/{bookId}")
	public Book updateBook(@PathParam("bookId") int bookId, Book book){
		book.setId(bookId);
		dao.updateBook(book);
		return book;
	}
	
	/**
	 * Delete.
	 *
	 * @param bookId the book id
	 */
	@DELETE
	@Path("/{bookId}")
	public void delete(@PathParam("bookId") int bookId){
		dao.removeBook(bookId);
	}
	
}
