package com.ktds.skd.board.board.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ktds.skd.board.board.biz.BoardBiz;
import com.ktds.skd.board.board.biz.BoardBizImpl;
import com.ktds.skd.board.board.user.vo.UsersVO;
import com.ktds.skd.board.board.vo.BoardVO;

public class DoWriteActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardBiz boardBiz;

	public DoWriteActionServlet() {
		boardBiz = new BoardBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// 파라미터를 받아와서 저장
		// String writer = request.getParameter("writer");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");

		// System.out.println(writer);
		System.out.println(subject);
		System.out.println(content);

		// content에는 enter가 들어갈 수 있기 때문에
		// \n이나 \r 과 같은 것들을 br로 바꿔준다.
		content = content.replaceAll("\n", "<br/>");
		content = content.replaceAll("\r", "");

		BoardVO boardVO = new BoardVO();

		// String ip = request.getRemoteAddr();
		// writer = writer + "(" + ip + ")";

		HttpSession session = request.getSession();
		UsersVO user = (UsersVO) session.getAttribute("_USER_");

		boardVO.setWriter(user.getUserId());
		boardVO.setIp(request.getRemoteAddr());
		boardVO.setSubject(subject);
		boardVO.setContent(content);

		if (boardBiz.writeArticle(boardVO)) {
			response.sendRedirect("/board/list");
		} else {
			response.sendRedirect("/board/write");
		}
	}
}
