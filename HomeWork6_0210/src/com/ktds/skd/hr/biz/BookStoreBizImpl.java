package com.ktds.skd.hr.biz;

import java.util.List;

import com.ktds.skd.hr.dao.BookStoreDao;
import com.ktds.skd.hr.dao.BookStoreDaoImpl;
import com.ktds.skd.hr.vo.BookStoreVO;

public class BookStoreBizImpl implements BookStoreBiz {

	BookStoreDao bookStoreDao = new BookStoreDaoImpl();

	@Override
	public void showBookStore() {
		List<BookStoreVO> allBookList = bookStoreDao.getAllBookList();

		for (BookStoreVO bookStoreVO : allBookList) {
			System.out.printf("%d\t %d\t %s\t %d\n", bookStoreVO.getBookStoreId(), bookStoreVO.getBooks().getBookId(),
					bookStoreVO.getBooks().getTitle(), bookStoreVO.getBooks().getPrice());
		}
	}

}
