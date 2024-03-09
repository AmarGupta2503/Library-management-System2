
package com.jsp.lms.model;

public class Book {

	private String bookName;
	private String bookAuthor;
	private double bookPrice;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Name of the book =" + bookName + "\n Author of the book =" + bookAuthor + "\n Price of the book =" + bookPrice + "\n Book added successfully";
	}
	
}
