<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book List</title>
</head>
<body>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
		</tr>
		<c:forEach items="${booksList}" var="books">
			<tr>
				<td>${books.bookId}</td>
				<td>
					<a href="/bookSelf/detail?bookId=${books.bookId}">${books.bookName}</a>
				</td>
			</tr>
		</c:forEach>
	</table>
	<a href="/bookSelf/write">목록 추가</a>
</body>
</html>