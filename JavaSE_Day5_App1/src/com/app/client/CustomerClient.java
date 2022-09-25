package com.app.client;

import com.bean.Customer;

public class CustomerClient {
	public static void main(String[]args) {
		Customer c1=new Customer();
		c1.setCustId(983);
		c1.setCustName("Jackson");
		c1.setCustLoc("New York");
		c1.setCustPhno(4700000000L);
		System.out.println(c1.getCustId()+" | "+c1.getCustName()+" | "+c1.getCustLoc()+" | "+c1.getCustPhno());
	}

}
