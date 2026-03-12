<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>third page~</h1>
	<%
	int aa = Integer.parseInt(request.getParameter("a"));
	int bb = Integer.parseInt(request.getParameter("b"));
	
	// 정석
	Object ccc = request.getAttribute("ccc");
	Integer ccc2 = (Integer) ccc;
	int ccc3 = ccc2.intValue();
	
	// 오토 박싱, 언박싱
	Object o = request.getAttribute("ccc");
	int o2 = (Integer) o;
	
	
	// 앞으로는 이렇게 하세요~~
	
	// 최종적으로 담고싶은데 담고, 에러나면 왼쪽 자료형의 참조버전으로 캐스트 처리(기본형의 wrapper class)
	int c = (Integer) request.getAttribute("ccc");
	
	
	
	
	%>
	
	<%=aa %> + <%=bb%> = <%=aa+bb %>
	<hr>
	<%=aa %> + <%=bb%> = <%=ccc %>
	<hr>
	
	
</body>
</html>