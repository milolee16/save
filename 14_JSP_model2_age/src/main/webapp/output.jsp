<%@ page import="com.mz.age.Bean" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Bean bb = (Bean) request.getAttribute("bean");
    %>

    <%= bb.getBirth()%> 년생 이시군요, 당신의 나이는 <%=bb.getAge()%>살 입니다.

</body>
</html>
