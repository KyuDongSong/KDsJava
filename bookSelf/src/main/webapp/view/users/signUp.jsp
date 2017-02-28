<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up Page</title>
</head>
<body>

	<form method="post" action="/bookSelf/doSignUp">
		<input type="text" name="userId" placeholder="Input User ID"/><br/>
		<input type="text" name="userName" placeholder="Input User Name" /><br/>
		<input type="password" name="userPassword" /><br/>
		<input type="submit" name="signUp"/>
	</form>

</body>
</html>