<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!-- 코어라이브러리를 쓰겠고 이름을 c라고 부르겠다. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="/templet/common_header.jsp" />
<link  type="text/css" rel="stylesheet" href="/board/css/list_layout.css"/>
<script type="text/javascript" src="/board/js/jquery-3.1.1.min.js"></script>

<div class="grid">
		총 ${count}건의 게시글이 검색되었습니다.
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>좋아요</th>
		</tr>


		<c:forEach items="${articleList}" var="board">
			<tr>
				<td>${board.boardId}</td>
				<td><a href="/board/detail?boardId=${board.boardId}">${board.subject}</a>
				</td>
				<td>${board.user.userName}(${board.writer})</td>
				<td>${board.writeDate}</td>
				<td>${board.likeCount}</td>
			</tr>
		</c:forEach>

	</table>
	<!-- 절대 주소: 프로토콜부터해서 다 적는.
		상대 주소: 프로토콜, 호스트, 포트까지를 지워는. -->
	<!-- <a href = "/board/write"> 글쓰기 </a> -->
	<a href="http://192.168.201.12:8080/board/write">글작성하기</a>
	<div>
		<form method = "post" id = "searchForm" >${pages}</form>
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
	Login...
</div>
<jsp:include page="/templet/common_footer.jsp" />


	<!-- <h1>${name}</h1>
	<p>${age}</p>
	<p>${param.keyword}</p> -->