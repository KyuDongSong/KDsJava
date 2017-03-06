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
import com.ktds.skd.board.board.vo.BoardSearchVO;
import com.ktds.skd.board.board.vo.BoardVO;
import com.ktds.skd.common.web.pager.ClassicPageExplorer;
import com.ktds.skd.common.web.pager.PageExplorer;
import com.ktds.skd.common.web.pager.Pager;
import com.ktds.skd.common.web.pager.PagerFactory;

public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private BoardBiz boardBiz;

	public ListServlet() {
		boardBiz = new BoardBizImpl();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doPost(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String pageNo = request.getParameter("pageNo");
		Pager pager = PagerFactory.getPager(Pager.ORACLE);
		pager.setPageNumber(pageNo);

		BoardSearchVO searchVO = new BoardSearchVO();
		searchVO.setPager(pager);
		List<BoardVO> articleList = boardBiz.getAllArticles(searchVO);
		
		PageExplorer pageExplorer = new ClassicPageExplorer(pager);
		String pages = pageExplorer.getPagingList("pageNo", "[@]", "PREV", "NEXT", "searchForm");

		RequestDispatcher dispatcher = request.getRequestDispatcher("/view/board/list.jsp");
		request.setAttribute("articleList", articleList);
		request.setAttribute("count", pager.getTotalArticleCount());
		request.setAttribute("pages", pages);

		// jsp 파일 읽어들이기
		// jsp file compile(request)하고 컴파일된 파일을 Tomcat에 전달(response)
		dispatcher.forward(request, response);
	}
}
