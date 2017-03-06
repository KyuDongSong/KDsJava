<%@page import="com.ktds.skd.board.board.vo.BoardSearchVO"%>
<%@page
	import="com.ktds.skd.board.board.biz.BoardBizImpl,
				com.ktds.skd.board.board.biz.BoardBiz,
				com.ktds.skd.board.board.vo.BoardVO,
				java.util.List,
				java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- html 뒤에 내용 다 지우기. -->
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
		//Scriptlet 시험에 나온다.
		//dao 쪽 손코딩 문제 나옴.
		//model 1 방식: html + java 코드 (안쓴다.)
		BoardBiz boardBiz = new BoardBizImpl();
		BoardSearchVO searchVO = new BoardSearchVO();
		List<BoardVO> boardList = boardBiz.getAllArticles(searchVO);
	%>

	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>작성일</th>
			<th>좋아요</th>
		</tr>

		<%
			BoardVO board = null;
			for (int i = 0; i < boardList.size(); i++) {
				board = boardList.get(i);
		%>
		<tr>
			<!-- %= : out.print의 short cut 방식
		short cut에는 ;를 적지 않는다. -->
			<td><%=board.getBoardId()%></td>
			<td><%=board.getSubject()%></td>
			<td><%=board.getWriteDate()%></td>
			<td><%=board.getWriteDate()%></td>
			<td><%=board.getLikeCount()%></td>
		</tr>

		<%
			}
		%>


	</table>

</body>
</html>

