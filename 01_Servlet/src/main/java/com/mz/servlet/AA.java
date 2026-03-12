package com.mz.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 어노테이션   주의사항
// 1. 복붙해도 저건 안바꿔줌. 수동처리
// 2. refactor해도 안바꿔줌.
@WebServlet("/AA")
public class AA extends HttpServlet {


	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("AA 진입!!!!");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	
		
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
