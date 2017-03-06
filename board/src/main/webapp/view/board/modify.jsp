<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<jsp:include page="/templet/common_header.jsp" />
<link rel="stylesheet" type="text/css"
	href="/board/css/modify_layout.css" />



<h1>글수정</h1>

<hr />

<!-- 아래와 같이 보내면 사용자 눈에 보임.
	<form method = "post" action="/board/doModify?boarId=?"> -->
<div class="modify">
	<form method="post" action="/board/doModify">
		<input type="hidden" name="boardId" value="${board.boardId}" /> <input
			type="text" name="writer" value="${board.writer}"
			placeholder="이름을 입력하세요." /><br /> <input type="text" name="subject"
			value="${board.subject}" placeholder="제목을 입력하세요" /><br />
		<textarea name="content" placeholder="내용을 입력하세요.">${board.content}</textarea>
		<input type="submit" value="글수정" />
	</form>

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


<!-- header / footer 세트로 안써주면, 페이지 안나옴 오류 -->
<jsp:include page="/templet/common_footer.jsp" />