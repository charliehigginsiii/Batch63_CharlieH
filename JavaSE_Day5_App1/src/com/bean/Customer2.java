package com.bean;

public class Customer2 {
	private int custId;
	private String custName;
	private String custLoc;
	private long custPhno;
	public Customer2(int custId, String custName, String custLoc, long custPhno) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custLoc = custLoc;
		this.custPhno = custPhno;
	}
	public String display() {
		return this.custId+" | "+this.custName+" | "+this.custLoc+" | "+this.custPhno;
	}
	

}
