<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	 // 1. 값
	 String a = request.getParameter("addr");
	%>
	당신의 주소는 <%=a %> 입니다.
</body>
</html>