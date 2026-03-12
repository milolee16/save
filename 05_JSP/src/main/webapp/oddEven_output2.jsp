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
	// 1. 값 받기
	int n = Integer.parseInt(request.getParameter("num"));
	String result = null;
	String color = null;
	if (n % 2 == 1) {
		result = "홀";
		color = "purple";
	} else{
		result = "짝";
		color = "tomato";
	}
	%>
	<h1 style="color: <%=color%>"><%=result %></h1>
	



</body>
</html>