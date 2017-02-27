package com.ktds.skd.board.board.user.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.board.board.user.biz.UserBiz;
import com.ktds.skd.board.board.user.biz.UserBizImpl;
import com.ktds.skd.board.board.user.vo.UsersVO;

public class DoSignUpActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserBiz userBiz;

	public DoSignUpActionServlet() {
		userBiz = new UserBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		String userName = request.getParameter("userName");

		UsersVO usersVO = new UsersVO();

		usersVO.setUserId(userId);
		usersVO.setUserPassword(userPassword);
		usersVO.setUserName(userName);

		if (userBiz.addMember(usersVO)) {
			response.sendRedirect("/board/user/signIn");
		} else {
			response.sendRedirect("/board/user/signIn");
		}
	}
}