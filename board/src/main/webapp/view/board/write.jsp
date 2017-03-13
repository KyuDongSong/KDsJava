<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="/templet/common_header.jsp" />
<link rel = "stylesheet" type = "text/css" href = "/board/css/write_layout.css" /> 
<script type="text/javascript" src="./jquery-3.1.1.min.js"></script>
<script type="text/javascript">
	$().ready(function(){
		$("#writeForm").find("input[type=button]").click(function(){
			//$("#writeForm").attr("method", "post");
			//$("#writeForm").attr("action", "/board/doWrite");
			$("#writeForm").attr({
				"method" : "post",
				"action" : "/board/doWrite"
			});
			$("#writeForm").submit();
		});
		
		$("#writeForm").find("img").click(function(){
			$.post("/board/doWrite", {
				"subject" : $(".subjects").val(),
				"content" : $(".contents").val()
			}, function(response){
				alert("Write Success!!");
			});
		});
		
	});
</script>

	<h1>글쓰기</h1>
	<hr />

	<!-- /board/doWrite로 정보를 writer / subject / content로 보내라. 
		전달되는 애들 parameter(request에 있는 것): writer, subject, content
		서블릿에 있는 request에서 파라미터를 가져올 수 있다.
		페이지 갱신 방법
		1) Get 방식: url치거나, 링크를 클릭해서 들어가는 방식
		2) Post 방식: form을 만들어서 전송하는 방식 / form으로 보낸것을 받는 녀석.
		method = "post": post로 보내라고 정의를해줘야 post방식으로 넘어가지 그냥 form으로 보낸다고해서 되는 것이 아님.
		
		post 방식 써야하는 이유?
		1) get 방식은 url 뒤에 ? 파라미터들 -> key = value & key = value 이런 식으로 전달됨.
		아이디 패스워드가 그대로 적히겠지? 보안 때문은 아니고(어차피 다 볼 수 있음.) 그냥 노출이되면 좀 그렇지.
		2) post 방식은 뒤에 ?(파라미터) 안붙음. 즉 파라미터를 url로 안보냄.
		request body라는 곳에 데이터를 넣어서 보내준다.
		3) 왜 굳이 구분 시켜놨을까?
		get방식은 "글자제한"(255자=8bit=1byte)이 있기 때문이다.	
		post방식은 2GB 이미지, 파일 등
		get + post 복합해서 사용 가능.
		
	
	-->
	
	<!-- <textarea></textarea>이 사이에 공백을 주면 x 공백이 곧 텍스트가 된다. -->
	
	<!-- 이제 로그인을 할 수 있으니, 작성자를 없애겠다. -->
	
	<div class = "write">
	<!-- jquery와 ajax를 이용하면 form 에서 method와 action을 적지 않는다. // submit도 button이나 img로 -->
	<!-- 	
	<form method = "post" action="/board/doWrite">
		<input type="text" name="writer" placeholder="이름을 입력하세요." /><br /> 
		<input
			type="text" name="subject" placeholder="제목을 입력하세요" /><br />
		<textarea name="content" placeholder="내용을 입력하세요."></textarea>
		<input type="submit" value="글쓰기" />
	</form> 
	-->
	<!-- jquery, ajax 스타일 -->
	<form id="writeForm">
		<input type="text" name="writer" placeholder="이름을 입력하세요." /><br /> 
		<input
			type="text" class="subjects" name="subject" placeholder="제목을 입력하세요" /><br />
		<textarea name="content" class="contents" placeholder="내용을 입력하세요."></textarea>
		<input type="button" value="글쓰기" />
		<img src="/board/img/ic_note_add_black_24dp_2x.png"/>
	</form> 
	</div><!--  
			
--><div class="login">
	<!-- jsp 내장 객체: (= 원래 존재하는 객체) servlet처럼 보내주지 않아도 session를 가져와서 정보를 볼 수 있다. -->
	<c:if test="${empty sessionScope._USER_}">
		<!-- 우리 filter는 로그인이 아예 안되어있으면, list페이지를 안보여주고 바로 signUp으로 가지만
					로그인이 안되었을 때, (= 세션 스콥이 비어있다면) 아래와 같이 작동한다. -->
		<jsp:include page="/view/users/signIn.jsp" />
	</c:if>
	<c:if test="${not empty sessionScope._USER_}">
		<!-- 비어있지 않다면, 로그인한 결과를 보여줘라. -->
					${sessionScope._USER_.userName}님, 환영합니다!
	</c:if>		
	</div>
	

<jsp:include page="/templet/common_footer.jsp" />