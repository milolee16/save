package com.mz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String i = request.getParameter("id");
		String p = request.getParameter("pw");
		
		System.out.println(i);
		System.out.println(p);
		// 브라우저에 뭘 쓰고 싶음 (html)
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");

		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		
		out.print("<style>");
		out.print("h2{color:red}");
		out.print("</style>");
		
		out.print("</head>");
		
		out.print("<body>");
		String status = "";
		if (i.equals("mz")) {
			if (p.equals("1004")) {
				 status ="로그인 성공!";
			}else {
				 status = "비번 오류";
			}
		} else {
			 status = "존재하지 않는 회원";
		}
		
		out.print("<h1>ID : " + i + "</h1>");
		out.printf("<h1>PW : %s</h1>", p);
		out.printf("<h2>%s</h2>",status);
		
		
		out.print("</body>");
		out.print("</html>");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String i = request.getParameter("id");
		String p = request.getParameter("pw");
		
		System.out.println(i);
		System.out.println(p);
		// 브라우저에 뭘 쓰고 싶음 (html)
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html>");

		out.print("<head>");
		out.print("<meta charset=\"UTF-8\">");
		
		out.print("<style>");
		out.print("h2{color:red}");
		out.print("</style>");
		
		out.print("</head>");
		
		out.print("<body>");
		String status = "";
		if (i.equals("mz")) {
			if (p.equals("1004")) {
				 status ="로그인 성공!";
			}else {
				 status = "비번 오류";
			}
		} else {
			 status = "존재하지 않는 회원";
		}
		
		out.print("<h1>ID : " + i + "</h1>");
		out.printf("<h1>PW : %s</h1>", p);
		out.printf("<h2>%s</h2>",status);
		
		
		out.print("</body>");
		out.print("</html>");
		
	}

}
