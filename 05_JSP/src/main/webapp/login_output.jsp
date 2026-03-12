<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h2{
color: red}
</style>
</head>
<body>
		<%
		 // 1. 값 받기
		 String id = request.getParameter("id");
		 String pw = request.getParameter("pw");
		%>
		
<h1>ID : <%=id %></h1>
<h1>PW : <%=pw %></h1>

		<% if(id.equals("mz")) {
			if(pw.equals("1004")) {   %>
				<h2>로그인 성공!</h2>
			<% } else { %>
				<h2>비번오류!</h2>
		<%	}
		} else { %>
				<h2>존재하지 않는 회원</h2>
		<% } %>









</body>
</html>