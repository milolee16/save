package com.mz.fileupload;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/FileUpload")
public class FileUpload extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// 1. 저장 경로(로컬, 실제 서버상 경로)
		String savePath = "C:\\Users\\soldesk\\Desktop\\asdasd\\mztest";
		String saveRealPath = request.getServletContext().getRealPath("imgFile");
		
		System.out.println(savePath);
		System.out.println(saveRealPath);
		
		
		
		// 서버를 나만 쓰는게 아니라 여러사람이 사용함.
		// 로컬 파일 이름은 얼마든지 같거나 중복될 수 있음.
		// 근데 서버에서 겹치면? 중복 되면 안되니까 파일명 처리가 필요함 a1.jpg, a2.jpg, a3.jpg, ....
		
		// 
		
		
		// 2. 파일 처리 (객체 생성 만으로도 업로드 기능처리 끝)
		MultipartRequest mr = new MultipartRequest(request, saveRealPath,
					30*1024*1024,   // 30mb 파일 최대 허용 용량(넘으면 예외)
					"utf-8",		// req.setChara("utf-8");
					new DefaultFileRenamePolicy()
				);
		
		// 1. 값 받기 (박스 포장을 했으니 그걸 까야 req(비닐)에 접근 가능)
		
		String name = mr.getParameter("name");
		System.out.println(name);
		
		
		// 파일명 읽을때
			// 아까 중복 안되게 처리한것 때문에 올릴때 파일명이 중요한게 아니고
			// 서버상에 올라간 '그' 이름이 중요함.
		String pic = mr.getFilesystemName("pic");
		String etc = mr.getFilesystemName("etc");
		System.out.println(pic);
		System.out.println(etc);
		
		
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		out.print("</head>");
		out.print("<body>");
		
		out.print("<h1>" + name + "</h1>");
		out.printf("<h1><img src='imgFile/%s'></h1>", pic);
		out.printf("<h1>%s</h1>", etc);

		out.printf("<h1><a href='imgFile/%s'>사진보기</a></h1>", pic);
		out.printf("<h1><a href='imgFile/%s'>파일 다운로드</a></h1>", etc);
		
		out.print("</body>");
		out.print("</html>");
	
		
		
	}

}
