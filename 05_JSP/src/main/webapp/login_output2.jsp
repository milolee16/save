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
		request.setCharacterEncoding("utf-8");
		 // 1. 값 받기
		 String id = request.getParameter("id");
		 String pw = request.getParameter("pw");
		
		String result = null;
		if(id.equals("mz")){
			if(pw.equals("1004")){
				result = "로그인 성공!";
			} else{
				result = "비번 오류";
			}
		} else{
			result = "존재하지 않는 회원";
		}
		%>
		
<h1>ID : <%=id %></h1>
<h1>PW : <%=pw %></h1>
<h2><%=result %></h2>









</body>
</html>