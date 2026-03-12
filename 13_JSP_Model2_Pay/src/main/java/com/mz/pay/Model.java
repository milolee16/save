package com.mz.pay;

import javax.servlet.http.HttpServletRequest;

public class Model {

	public static void calc(HttpServletRequest request) {
		// 1. 값
		int earn = Integer.parseInt(request.getParameter("earn"));
		int spend = Integer.parseInt(request.getParameter("spend"));
		
		System.out.println(earn);
		System.out.println(spend);
		
		int remain = earn - spend;
		
		// 결과에서 뭐 쓸지?
			// earn, spend, remain
		
		// 뭉쳐서 보내자 (객체)
		Result r = new Result(earn, spend, remain);
		request.setAttribute("rr", r);
		
		
		
	}


	
	
	
}
