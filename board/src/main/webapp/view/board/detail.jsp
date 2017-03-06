<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 쓰던 안쓰던 써놓기. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/templet/common_header.jsp" />
<!-- 이미 정의되어있는 .login 스타일을 쓰기위해서 가져옴 -->
<link rel = "stylesheet" type = "text/css" href = "/board/css/list_layout.css" />
<link rel = "stylesheet" type = "text/css" href = "/board/css/detail_layout.css" />
	
	
	<div class = "detail">
		<h1>${board.subject}</h1>
		<hr/>
		
		<div class = "author">
			<span>${board.writer}</span> / <span>${board.writeDate}</span> /
			<span>${board.likeCount}</span>
		</div>
		
		<br/>
		<p>
			${board.content}
		</p>
		<hr/>
		<div class = "controls">
			<a href="/board/modify?boardId=${board.boardId}">수정</a> | 
			<a href="http://192.168.201.12:8080/board/doDelete?boardId=${board.boardId}">삭제</a> | 
			<a href="/board/list"> 목록으로 돌아가기 </a> | 
			<a href="/board/write">글쓰기 </a>
		</div>
	</div><!--  
			
--><div class="login">
	<!-- jsp 내장 객체: (= 원래 존재하는 객체) servlet처럼 보내주지 않아도 session를 가져와서 정보를 볼 수 있다. -->
	<c:if test="${empty sessionScope._USER_}">
		<!-- 우리 filter는 로그인이 아예 안되어있으면, list페이지를 안보여주고 바로 signUp으로 가지만
					로그인이 안되었을 때, (= 세션 스콥이 비어있다면) 아래와 같이 작동한다. -->
		<jsp:include page="/view/users/signIn.jsp" />
	</c:if>
	<c:if test="${not empty sessionScope._USER_}">
		<!-- 비어있지 않다면, 로그인한 결과를 보여줘라. -->
					${sessionScope._USER_.userName}님, 환영합니다!
	</c:if>		
	</div>
<jsp:include page="/templet/common_footer.jsp" />