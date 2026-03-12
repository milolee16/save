package com.mz.attr;

import javax.servlet.http.HttpServletRequest;

public class Model {

	public static void getExchange(HttpServletRequest request) {
			// 1. 값
		
		int price = Integer.parseInt(request.getParameter("p"));
		int money = Integer.parseInt(request.getParameter("m"));
		
		// 1000   5000   4000
		int ex = money - price;
		
		String say = "잔돈 여기 있습니다~~";
		if (price == money) {
			say = "감사합니다";
		} else if (price > money) {
			say = "돈 모자른데요..? -_-?";
			ex = price - money;
		}
		
		// 결과페이지에서 뭘 쓸지?
		//    price, money, ex, say
//		request.setAttribute("price", price);
//		request.setAttribute("money", money);
//		request.setAttribute("ex", ex);
//		request.setAttribute("say", say);
		
		// 위에처럼 필요한 것들을 따로 실어서 보내도 되는데,
		// 그걸 한데 뭉쳐서 보내자 (객체)
		
		Result r = new Result(price, money, ex, say);
		request.setAttribute("rr", r);
		
	}
	
	public static void makeValue(HttpServletRequest request) {
			int asd = Integer.parseInt(request.getParameter("asd"));
			asd *= -1;		// 미완성 데이터 경우 양수로 만들어주기
			request.setAttribute("asdasd", asd);
	}
	
	
	

}
