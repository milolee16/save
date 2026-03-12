package com.mz.attr;

// Java Bean
// VO, DTO, POJO
public class Result {
// 필드, 속성, 멤버변수, 인스턴스변수
	// 결과에서 뭘쓸지?
	private int price;
	private int money;
	private int ex;
	private String say;
	
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getEx() {
		return ex;
	}
	public void setEx(int ex) {
		this.ex = ex;
	}
	public String getSay() {
		return say;
	}
	public void setSay(String say) {
		this.say = say;
	}
	
	public Result() {
		// TODO Auto-generated constructor stub
	}
	public Result(int price, int money, int ex, String say) {
		super();
		this.price = price;
		this.money = money;
		this.ex = ex;
		this.say = say;
	}
	
	
	
	
	
	
	
}
