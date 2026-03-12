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
	// 1. 값만 받는 공간.     계산 x => Model
		String a = request.getParameter("a");
		String b = request.getParameter("b");
		Object c = request.getAttribute("ccc");
%>
<h1>계산 결과</h1>
<%=a %> + <%=b %> = <%=c %>
<hr>












</body>
</html>