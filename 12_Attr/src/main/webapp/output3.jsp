<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

p : <%=request.getParameter("p") %> <br>
m : <%=request.getParameter("m") %> <br>
rr : <%= request.getAttribute("rr") %> <br>
<hr>

			<%= request.getParameter("howmuch") %> 원 부족하시네요!!!!
			<hr>
			
			<%= request.getParameter("asd") %> 원이 모자라요~
			<hr>
			<%= request.getAttribute("asdasd") %>
			
</body>
</html>