package com.ktds.skd.book.users.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ktds.skd.book.users.biz.UserBiz;
import com.ktds.skd.book.users.biz.UserBizImpl;
import com.ktds.skd.book.users.vo.UsersVO;

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
		String userName = request.getParameter("userName");
		String userPassword = request.getParameter("userPassword");

		UsersVO usersVO = new UsersVO();
		usersVO.setUserId(userId);
		usersVO.setUserName(userName);
		usersVO.setUserPassword(userPassword);

		if (userBiz.addUser(usersVO)) {
			response.sendRedirect("/view/users/signIn");
		} else {
			response.sendRedirect("view/users/signUp");
		}
	}

}
