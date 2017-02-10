package com.ktds.skd.hr.vo;

import com.ktds.skd.dao.support.annotation.Types;

public class BookVO {

	@Types
	private int bookId;
	@Types
	private int price;

	@Types
	private String title;
	@Types
	private String writer;

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}
