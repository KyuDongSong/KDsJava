package com.ktds.skd.book.dao;

import java.util.List;

import com.ktds.skd.book.vo.BooksVO;

public interface BookDao {

	public List<BooksVO> getAllBooks();
	
	public BooksVO getOneBook(int bookId);
	
	public int insertBook(BooksVO booksVO);
	
	public int deleteBook(int bookId);
	
	public int modifyBook(BooksVO booksVO);
	
}
