<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Bitcount+Prop+Double+Ink:wght@100..900&display=swap" rel="stylesheet">

<style type="text/css">
.bg-a{
 background-color: #dfa9f3;
}
.bg-b{
 background-color: #cafbcc;
}
.bg-c{
 background-color: #f8fada;
}
.bg-d{
 background-color: #fbe5de;
}
.a{
	color: red;
}
.b{
	color: green;
}
.c{
	color: gold;
}
.d{
	color: pink;
}
body{
     font-family: "Bitcount Prop Double Ink", system-ui;
}



span{
    font-weight:bold;
}

button{
    margin-top:15px;
    padding:10px 20px;
    border:none;
    border-radius:6px;
    background:#4CAF50;
    color:white;
    font-size:16px;
    cursor:pointer;
}

button:hover{
    background:#45a049;
}


</style>
</head>
<body>
	<%
	double n = Double.parseDouble(request.getParameter("num"));
	String unit = request.getParameter("unit");
	String cc = "d";
	double result = n * 0.6213;
	String convertUnit = "mi/h";		
	if(unit.equals("cm")){
		result = n * 0.3937;
		convertUnit = "inch";
		 cc = "a";
	}else if(unit.equals("㎡")){
		result = n * 0.3025;
		convertUnit = "평";
		 cc = "b";
	}else if(unit.equals("℃")){
		result = n * 1.8 + 32;
		convertUnit = "℉";
		 cc = "c";
	}
	%>
	
	<div class="bg-<%=cc%>">
		<div>변환결과</div>
		<div><%=n %> <span class="<%=cc%>"><%=unit %></span></div>
		<div>↓</div>
		<div><%=String.format("%.1f", result) %> <span class="<%=cc%>"><%=convertUnit %></span></div>
		<div> <button onclick="location.href='input.html'">돌아가기</button> </div>
	</div>
	
	
	
	
</body>
</html>