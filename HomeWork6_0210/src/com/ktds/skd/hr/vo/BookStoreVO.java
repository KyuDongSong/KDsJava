package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class BookStoreVO {

	@Types
	private int BookStoreId;
	@Types
	private int stock;
	@Types
	private int bookId;

	@Types
	private String Category;

	public int getBookStoreId() {
		return BookStoreId;
	}

	public void setBookStoreId(int bookStoreId) {
		BookStoreId = bookStoreId;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	private BookVO books;

	public BookVO getBooks() {
		if (books == null) {
			books = new BookVO();
		}
		return books;
	}

	public void setBooks(BookVO books) {
		this.books = books;
	}

}
