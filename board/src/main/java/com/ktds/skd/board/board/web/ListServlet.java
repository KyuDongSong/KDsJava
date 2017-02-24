package com.ktds.skd.board.board.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.board.board.biz.BoardBiz;
import com.ktds.skd.board.board.biz.BoardBizImpl;
import com.ktds.skd.board.board.vo.BoardVO;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardBiz boardBiz;

	public ListServlet() {
		boardBiz = new BoardBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<BoardVO> articleList = boardBiz.getAllArticles();
		request.setAttribute("articleList", articleList);

		// jsp 파일 읽어들이기
		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/board/list.jsp");
		// jsp file compile(request)하고 컴파일된 파일을 Tomcat에 전달(response)
		dispatcher.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
