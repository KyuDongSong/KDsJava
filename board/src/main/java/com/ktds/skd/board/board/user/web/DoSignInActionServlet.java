package com.ktds.skd.board.board.user.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ktds.skd.board.board.user.biz.UserBiz;
import com.ktds.skd.board.board.user.biz.UserBizImpl;
import com.ktds.skd.board.board.user.vo.UsersVO;

public class DoSignInActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UserBiz userBiz;
    public DoSignInActionServlet() {
    	userBiz = new UserBizImpl();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userId = request.getParameter("userId");
		String userPassword = request.getParameter("userPassword");
		
		UsersVO usersVO = new UsersVO();
		usersVO.setUserId(userId);
		usersVO.setUserPassword(userPassword);
		
		usersVO = userBiz.memberSignUp(usersVO);
		
		if(usersVO == null){
			response.sendRedirect("/board/usr/login");
		} else {
			
			// 세션 컨테이너를 가지고온다.
			HttpSession session= request.getSession();
			session.setAttribute("_USER_", usersVO);
			
			System.out.println("User ID: " + usersVO.getUserId());
			System.out.println("User NAME: " + usersVO.getUserName());
			System.out.println("User Password: " + usersVO.getUserPassword());
			System.out.println("Join Date: " + usersVO.getJoinDate());
			response.sendRedirect("/board/list");
		}
		

	}
}
