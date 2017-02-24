<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Modify</h1>
	<hr />
	<form method="post" action="/board/doModify">
		<input type="hidden" name="boardId" value="${board.boardId}" />
		<input type="text" name="writer" value="${board.writer}" placeholder="Input Name" /><br /> 
		<input type="text" name="subject" value="${board.subject}" placeholder="Input Subject" /><br /> 
		<textarea name="content" placeholder="Input Content">${board.content}</textarea><br /> 
		<input type="submit" value="Write" />
	</form>
</body>
</html>