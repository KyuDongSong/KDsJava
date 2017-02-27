package com.ktds.skd.book.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.book.biz.BookBiz;
import com.ktds.skd.book.biz.BookBizImpl;
import com.ktds.skd.book.vo.BooksVO;

public class ViewModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookBiz bookBiz;

	public ViewModifyServlet() {
		bookBiz = new BookBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String bookIdString = request.getParameter("bookId");
		int bookId = 0;

		try {
			bookId = Integer.parseInt(bookIdString);
		} catch (NumberFormatException e) {
			throw new RuntimeException("존재하지 않는 게시글 이거나, 잘못된 접근");
		}

		BooksVO booksVO = bookBiz.showOneBook(bookId);
		String index = booksVO.getIndex();

		index = index.replaceAll("<br/>", "\n");
		booksVO.setIndex(index);

		request.setAttribute("book", booksVO);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/modify.jsp");
		dispatcher.forward(request, response);
	}

}
