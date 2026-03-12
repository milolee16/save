package com.mz.model2;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// C (Controller) - 교통정리
// 상황판단해서 필요한쪽으로 보냄

// 웹사이트 진입점 (실행을 여기서)
@WebServlet("/C")
public class C extends HttpServlet {
	
	// 주소를 쳐서 접속하거나 클릭해서 들어감 - GET
	// 어떤 사이트를 처음 들어가는경우 - GET
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			System.out.println("test11");
			response.sendRedirect("v1.html");
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 비즈니스 로직을 M에
		M.calc(request);
	
		// 어디로?
			RequestDispatcher rd = request.getRequestDispatcher("v2.jsp");
			rd.forward(request, response);
	}

}
