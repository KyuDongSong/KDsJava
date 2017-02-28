package com.ktds.skd.book.book.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.book.book.biz.BookBiz;
import com.ktds.skd.book.book.biz.BookBizImpl;
import com.ktds.skd.book.book.vo.BooksVO;

public class DoModifyActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookBiz bookBiz;

	public DoModifyActionServlet() {
		bookBiz = new BookBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String bookName = request.getParameter("bookName");
		String bookSubName = request.getParameter("bookSubName");
		String index = request.getParameter("index");
		
		String bookIdString = request.getParameter("bookId");
		int bookId = 0;
		try {
			bookId = Integer.parseInt(bookIdString);
		} catch (NumberFormatException e) {
			throw new RuntimeException("잘못된 접근");
		}

		System.out.println(bookId);
		System.out.println(bookName);
		System.out.println(bookSubName);
		System.out.println(index);

		index = index.replaceAll("\n", "<br/>");
		index = index.replaceAll("\r", "");

		BooksVO booksVO = new BooksVO();

		booksVO.setBookId(bookId);
		booksVO.setBookName(bookName);
		booksVO.setBookSubName(bookSubName);
		booksVO.setIndex(index);

		if (bookBiz.modifyBook(booksVO)) {
			response.sendRedirect("/bookSelf/list");
		} else {
			response.sendRedirect("/bookSelf/modify");
		}
	}

}
