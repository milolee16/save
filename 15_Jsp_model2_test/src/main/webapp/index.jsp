<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<%--
        Test

        Model2 방식 (MVC 패턴) 방식으로 구현
        - 값 뭉쳐 보내기

        결과페이지
        - 회원 정보 확인 -
        이름 : ㅇㅇ
        나이 : ㅇㅇ
        성별 : ㅇㅇ
        관심사 : ㅇㅇ / ㅇㅇ / ㅇㅇ

--%>
<body>
<form action="hello-servlet">
    <div>관심사 리스트</div>
    <div>
        회원 이름 :<input type="text" name="name">
    </div>
    <div>
        나이 :<input type="text" name="age">
    </div>
    <div>성별 : <label><input type="radio" name="gender" value="male">남</label>
        <label><input type="radio" name="gender" value="female">여</label>
    </div>
    <div>
        <label ><input type="checkbox" name="habit" value="excer">운동</label>
        <label ><input type="checkbox" name="habit" value="cook">요리</label>
        <label ><input type="checkbox" name="habit" value="dev">개발</label>
    </div>
    <div>
        <button>확인</button>
    </div>
</form>
</body>
</html>