<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Write</h1>
	<hr />
	<form method="post" action="/board/doWrite">
		<!-- <input type="text" name="writer" placeholder="Input Name" /><br />  -->
		<input type="text" name="subject" placeholder="Input Subject" /><br /> 
		<textarea name="content" placeholder="Input Content"></textarea><br /> 
		<input type="submit" value="Write" />
	</form>
</body>
</html>