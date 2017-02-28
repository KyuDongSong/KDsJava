package com.ktds.skd.book.book.biz;

import java.sql.SQLException;
import java.util.List;

import com.ktds.skd.book.book.vo.BooksVO;

public interface BookBiz {

	public List<BooksVO> showAllBookList() throws SQLException;

	public BooksVO showOneBook(int bookId);

	public boolean insertBook(BooksVO booksVO);

	public boolean deleteBook(int bookId);

	public boolean modifyBook(BooksVO booksVO);
}
