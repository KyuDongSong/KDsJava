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

	<form method="post" action="/board/user/doSignUp">
		<input type="text" name="userId" placeholder="Input ID" /><br /> 
		<input type="password" name="userPassword" placeholder="Input PWD" /><br />
		<input type="text" name="userName" placeholder="Input Name" /><br /> 
		<input type="submit" value="가입" />
	</form>

</body>
</html>