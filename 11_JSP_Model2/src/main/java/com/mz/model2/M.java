package com.mz.model2;

import javax.servlet.http.HttpServletRequest;

// M (Model) - 비즈니스 로직
// 계산, 일, db
public class M {

	
	
		public static void calc(HttpServletRequest request) {
			// 1. 값 받기
			int a = Integer.parseInt(request.getParameter("a"));
			int b = Integer.parseInt(request.getParameter("b"));
	
			int c = a+b;
			request.setAttribute("ccc", c);
			
		}
	
	
	
}
