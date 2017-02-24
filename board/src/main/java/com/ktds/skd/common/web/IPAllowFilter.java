package com.ktds.skd.common.web;

import java.io.IOException;
import javax.servlet.*;

public class IPAllowFilter implements Filter {
	FilterConfig filterConfig;
	// 허용 ip string[]. web.xml에서 parameter로 전달해 주어야 함.
	String[] allowIPs;
	String denyMessage;

	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
		String ips = filterConfig.getInitParameter("allowIPs");
		allowIPs = ips.split(",");
		denyMessage = filterConfig.getInitParameter("denyMessage");
		System.out.println("ips :" + ips);
		System.out.println("denyMessage :" + denyMessage);
		for (int i = 0; i < allowIPs.length; i++) {
			allowIPs[i] = allowIPs[i].trim();
		}
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String ip = request.getRemoteAddr();
		System.out.println("IpAllowFilter is called!!!   client ip :" + ip);
		boolean inList = false;
		for (int i = 0; i < allowIPs.length; i++) {
			if (allowIPs[i].equals(ip)) {
				inList = true;
				break;
			}
		}
		if (inList) {
			// Pass control on to the next filter
			chain.doFilter(request, response);
		} else {
			response.getWriter().print(denyMessage);
		}
	}

	public void destroy() {
		filterConfig = null;
		allowIPs = null;
	}

}
