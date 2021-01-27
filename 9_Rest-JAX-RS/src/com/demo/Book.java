/*
 * 
 */
package com.demo;

/**
 * The Class Book.
 */
public class Book {
	
	/** The id. */
	private int id;
	
	/** The isbn. */
	private String isbn;
	
	/** The title. */
	private String title;
	
	/** The author. */
	private String author;
	
	/** The price. */
	private double price;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the isbn.
	 *
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * Sets the isbn.
	 *
	 * @param isbn the new isbn
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * Gets the title.
	 *
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * Instantiates a new book.
	 *
	 * @param id the id
	 * @param isbn the isbn
	 * @param title the title
	 * @param author the author
	 * @param price the price
	 */
	public Book(int id, String isbn, String title, String author, double price) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}

	/**
	 * Instantiates a new book.
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

}