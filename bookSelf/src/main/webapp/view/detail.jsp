<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Book Detail</title>
</head>
<body>

	<h1>${book.bookId}</h1>
	<h3>${book.bookName}</h3>
	<h5>${book.bookSubName}</h5>
	<hr/>
	<p>${book.index}</p>
	<hr/>

	<a href="/bookSelf/modify?bookId=${book.bookId}"> 수 정</a> |
	<a href="/bookSelf/doDelete?bookId=${book.bookId}"> 삭 제</a> |
	<a href="/bookSelf/list"> 돌아가기</a>
	
	

</body>
</html>