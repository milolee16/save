<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" href="bmi_byGPT.css">
	<script src="bmi_byGPT.js"></script>
</head>
<body onload="selectTag()">
 <%
 		// 1. 로컬경로
// 		String path = "C:\\Users\\soldesk/Desktop/asdasd";
 		// 서버상 경로
 		String path = request.getServletContext().getRealPath("uploadFile");
 		System.out.println(path);
 
 
 		// 파일 업로드 기능.		// cos.jar   
 		// 2. mr 객체 생성
 		
 		MultipartRequest mr = new MultipartRequest(request, path,
 				1024 * 1024 * 20,  // 20mb 최대 허용 용량
 				"utf-8", // req.setCharacter("utf-8") 그거
 				new DefaultFileRenamePolicy()
 				);
 		
 		
		// 3. 값 받기 	
		
		String n = mr.getParameter("name");
		double height = Double.parseDouble(mr.getParameter("height"));
		double weight = Double.parseDouble(mr.getParameter("weight"));
 		
 		String imgF = mr.getFilesystemName("imgFile"); // 서버상 올라간 파일명
		
 		if (height > 10) {
 			// cm로 입력했을것.
 			height /= 100;
 		}

 		double bmi = weight / (height * height); // m용 계산
 		String bmi2 = String.format("%.1f", bmi);
 		System.out.println(bmi);
 		// @ cm, m 다 되게	

 		String status = "3단계 비만";
 		if (bmi < 18.5) {
 			status = "저체중";
 		} else if (bmi <= 22.9) {
 			status = "정상";
 		} else if (bmi <= 24.9) {
 			status = "비만전단계";
 		} else if (bmi <= 29.9) {
 			status = "1단계 비만";
 		} else if (bmi <= 34.9) {
 			status = "2단계 비만";
 		}
 %>

	<div class="wrap">
		<div>BMI 결과</div>
		<div class="items first">
			<div>
				<img id="img" style="width: 200px" src="uploadFile/<%=imgF %>">
				<video id="video" src="uploadFile/<%=imgF %>" loop autoplay controls style="width: 200px"></video>
			</div>
		</div>


		<div class="items">
			<div>이름</div>
			<div>
				<%=n %>
			</div>
		</div>
		<div class="items">
			<div>키 (cm)</div>
			<div>
				<%=height*100 %>
			</div>
		</div>
		<div class="items">
			<div>체중 (kg)</div>
			<div>
				<%=weight %>
			</div>
		</div>
		<div class="items">
			<div>BMI</div>
			<div>
				<%=bmi2 %>
			</div>
		</div>
		<div class="items">
			<div>결과</div>
			<div>
				<%=status %>
			</div>
		</div>
		

		<div>
<!-- 			<button onclick="history.back()">다시하기</button> -->
			<button onclick="location.href='bmi_byGPT.html'">다시하기</button>
		</div>
	</div>





</body>
</html>