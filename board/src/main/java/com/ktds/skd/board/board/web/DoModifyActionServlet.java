package com.ktds.skd.board.board.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.board.board.biz.BoardBiz;
import com.ktds.skd.board.board.biz.BoardBizImpl;
import com.ktds.skd.board.board.vo.BoardVO;

public class DoModifyActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardBiz boardBiz;

	public DoModifyActionServlet() {
		boardBiz = new BoardBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// �Ķ���͸� �޾ƿͼ� ����
		String writer = request.getParameter("writer");
		String subject = request.getParameter("subject");
		String content = request.getParameter("content");
		String boardIdStrng = request.getParameter("boardId");
		int boardId = 0;

		try {
			boardId = Integer.parseInt(boardIdStrng);
		} catch (NumberFormatException e) {
			throw new RuntimeException("�߸��� ����");
		}

		System.out.println(writer);
		System.out.println(subject);
		System.out.println(content);

		// content���� enter�� �� �� �ֱ� ������
		// \n�̳� \r �� ���� �͵��� br�� �ٲ��ش�.

		content = content.replaceAll("\n", "<br/>");
		content = content.replaceAll("\r", "");

		BoardVO boardVO = new BoardVO();

		String ip = request.getRemoteAddr();
		writer = writer + "(" + ip + ")";

		boardVO.setWriter(writer);
		boardVO.setSubject(subject);
		boardVO.setContent(content);
		boardVO.setBoardId(boardId);

		if (boardBiz.updateArticle(boardVO)) {
			response.sendRedirect("/board/list");
		} else {
			response.sendRedirect("/board/write");
		}
	}

}
