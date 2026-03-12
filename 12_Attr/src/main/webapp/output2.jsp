<%@page import="com.mz.attr.Result"%>
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
	// 값 받기
	Result r = (Result) request.getAttribute("rr");
	%>

	<h1>계산 결과22222222222</h1>

	<div>
		<div>
			상품 가격 :
			<%=r.getPrice()%></div>
		<div>
			지불한 돈 :
			<%=r.getMoney()%></div>
		<div>
			잔돈 :
			<%=r.getEx()%></div>
		<div>
			멘트 :
			<%=r.getSay()%></div>
	</div>

	<hr>
	<%=request.getParameter("p")%>
	<br>
	<%=request.getParameter("m")%>

	<hr>

	1. 돈이 모자를때만 버튼이 나오게 [얼마모자른데요??] 버튼을 누르면 output3.jsp에서 모자른 금액 안내 상품이
	10000원 내 5000원 5000원이 모자라요~

	<%
//  if(r.getEx() < 0)
	if (r.getMoney() < r.getPrice()) {
		int howmuch = r.getPrice() - r.getMoney();
	%>
	<a href="output3.jsp?howmuch=<%=howmuch%>">
		<button>얼마모자른데요??</button>
	</a>

	<a href="output3.jsp?howmuch=<%=r.getEx() * -1%>">
		<button>얼마모자른데요??</button>
	</a>

	<a href="output3.jsp?howmuch=<%=r.getPrice() - r.getMoney()%>">
		<button>얼마모자른데요??</button>
	</a>

	<button
		onclick="location.href='output3.jsp?howmuch=<%=r.getEx() * -1%>' ">얼마모자른데요??</button>

	<form action="output3.jsp">
		<input name="howmuch" hidden value="<%=r.getEx() * -1%>">
		<button>얼마요??</button>
	</form>



	<hr>
	<hr>

	<form action="ExController">
		<input name="howmuch" hidden value="<%=r.getEx() * -1%>">
		<button>얼마요??</button>
	</form>


	<form action="ExController" method="post">
		<input name="asd" value="<%=r.getEx() * -1%>">
		<button>얼마요??(데이터 이미 완성)</button>
	</form>

	<form action="ExController" method="post">
		<input name="asd" value="<%=r.getEx()%>">
		<button>얼마요??(데이터 미완성)</button>
	</form>


	<%
	}
	%>






</body>
</html>