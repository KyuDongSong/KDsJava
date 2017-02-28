package com.ktds.skd.book.book.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.book.book.biz.BookBiz;
import com.ktds.skd.book.book.biz.BookBizImpl;
import com.ktds.skd.book.book.vo.BooksVO;

public class ViewListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BookBiz bookBiz;
	public ViewListServlet() {
		bookBiz = new BookBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		List<BooksVO> booksList = null;
		try {
			booksList = bookBiz.showAllBookList();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("booksList", booksList);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/book/list.jsp");
		dispatcher.forward(request, response);
	}

}
