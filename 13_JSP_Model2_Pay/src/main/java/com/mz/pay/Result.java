package com.mz.pay;

public class Result {
	
	private int earn;
	private int spend;
	private int remain;
	
	public Result() {
		// TODO Auto-generated constructor stub
	}

	public Result(int earn, int spend, int remain) {
		super();
		this.earn = earn;
		this.spend = spend;
		this.remain = remain;
	}

	public int getEarn() {
		return earn;
	}

	public void setEarn(int earn) {
		this.earn = earn;
	}

	public int getSpend() {
		return spend;
	}

	public void setSpend(int spend) {
		this.spend = spend;
	}

	public int getRemain() {
		return remain;
	}

	public void setRemain(int remain) {
		this.remain = remain;
	}
	
	
	
	
}
