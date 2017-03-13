<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- href: 절대 경로 적기. (= url 적듯이) -->
<!-- 광범위한 css부터 쓰기. Import의 순서에 따라 UI가 달라진다. -->
<link rel="stylesheet" type="text/css" href="/board/css/common_layout.css">
<script type="text/javascript" src="/board/js/jquery-3.1.1.min.js"></script>

</head>
<body>
	<div id="wrapper">
		<div id="nav">

			<a href="/board/user/signIn"> 로그인 </a> | <a href="/board/user/signUp">회원가입</a>
			| <a href="/board/doLogout">로그아웃</a>
		</div>
		<div id="content">