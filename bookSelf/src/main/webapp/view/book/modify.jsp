<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="/bookSelf/doModify">
		<input type="hidden" name="bookId" value="${book.bookId}"/>
		<input type="text" name="bookName" value="${book.bookName}" placeholder="Input Book Name" /><br/>
		<input type="text" name="bookSubName" value="${book.bookSubName}" placeholder="Input Book Sub Name"/><br/>
		<textarea  name="index" placeholder="Input index">${book.index}</textarea><br/>
		<input type="submit" name="Write"/>
	</form>
</body>
</html>