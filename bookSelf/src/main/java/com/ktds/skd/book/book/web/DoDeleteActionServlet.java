package com.ktds.skd.book.book.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.book.book.biz.BookBiz;
import com.ktds.skd.book.book.biz.BookBizImpl;
import com.ktds.skd.book.book.vo.BooksVO;

public class DoDeleteActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookBiz bookBiz;

	public DoDeleteActionServlet() {
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
		
		try{
			bookId = Integer.parseInt(bookIdString);
		} catch(NumberFormatException e){
			throw new RuntimeException("잘못된 접근");
		}
		if(bookBiz.deleteBook(bookId)){
			response.sendRedirect("/bookSelf/list");
		} else {
			response.sendRedirect("/bookSelf/list");
		}
	}

}
