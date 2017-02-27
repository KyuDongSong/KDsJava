package com.ktds.skd.book.biz;

import java.sql.SQLException;
import java.util.List;

import com.ktds.skd.book.dao.BookDao;
import com.ktds.skd.book.dao.BookDaoImpl;
import com.ktds.skd.book.vo.BooksVO;

public class BookBizImpl implements BookBiz {

	private BookDao bookDao;

	public BookBizImpl() {
		bookDao = new BookDaoImpl();
	}

	@Override
	public List<BooksVO> showAllBookList() throws SQLException {
		return bookDao.getAllBooks();
	}

	@Override
	public BooksVO showOneBook(int bookId) {
		return bookDao.getOneBook(bookId);
	}

	@Override
	public boolean insertBook(BooksVO booksVO) {
		return bookDao.insertBook(booksVO) > 0;
	}

	@Override
	public boolean deleteBook(int bookId) {
		return bookDao.deleteBook(bookId) > 0;
	}

	@Override
	public boolean modifyBook(BooksVO booksVO) {
		return bookDao.modifyBook(booksVO) > 0;
	}

}
