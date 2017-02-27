package com.ktds.skd.book.commom.web;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// ��� url���� ��û, ���信 char encoding UTF-8�� ����
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

		// pass the request along the filter charin
		chain.doFilter(request, response); // Servlet�� ��û|����
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
