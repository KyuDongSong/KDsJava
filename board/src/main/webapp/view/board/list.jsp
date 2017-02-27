<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>test</title>
</head>
<body>

	<%-- EL ${}는 ListServlet의 getAttribute에 있는 name에 접근해서 데이터를 가져온다 --%>
	<!-- request가 전달한 정보를 그대로 가져온다. -->
	<h1>${name}</h1>
	<h3>${age}</h3>
	<p>${now}</p>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>좋아요</th>
		</tr>
		<c:forEach items="${articleList}" var="article">
			<tr>
				<td>${article.boardId}</td>
				<td>
					<a href="/board/detail?boardId=${article.boardId}">${article.subject}</a>
				</td>
				<td>${article.user.userName}(${article.writer})</td>
				<td>${article.writeDate}</td>
				<td>${article.likeCount}</td>
			</tr>
		</c:forEach>

	</table>

	<a href="/board/write">글쓰기</a>

</body>
</html>