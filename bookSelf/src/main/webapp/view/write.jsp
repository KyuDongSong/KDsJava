<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>목록 추가</title>
</head>
<body>
	<form method="post" action="/bookSelf/doWrite">
		<input type="text" name="bookName" placeholder="Input Book Name" /><br/>
		<input type="text" name="bookSubName" placeholder="Input Book Sub Name" /><br/>
		<textarea  name="index" placeholder="Input index" /></textarea><br/>
		<input type="submit" name="Write"/>
	</form>
</body>
</html>