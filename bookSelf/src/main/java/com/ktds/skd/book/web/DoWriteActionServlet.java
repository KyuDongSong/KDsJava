package com.ktds.skd.book.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.book.biz.BookBiz;
import com.ktds.skd.book.biz.BookBizImpl;
import com.ktds.skd.book.vo.BooksVO;

public class DoWriteActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookBiz bookBiz;

	public DoWriteActionServlet() {
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

		System.out.println(bookName);
		System.out.println(bookSubName);
		System.out.println(index);

		index = index.replaceAll("\n", "<br/>");
		index = index.replaceAll("\r", "");

		BooksVO booksVO = new BooksVO();

		booksVO.setBookName(bookName);
		booksVO.setBookSubName(bookSubName);
		booksVO.setIndex(index);

		if (bookBiz.insertBook(booksVO)) {
			response.sendRedirect("/bookSelf/list");
		} else {
			response.sendRedirect("/bookSelf/write");
		}
	}

}
