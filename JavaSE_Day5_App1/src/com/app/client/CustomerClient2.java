package com.app.client;

import com.bean.Customer2;

public class CustomerClient2 {
	public static void main(String[]args) {
		Customer2 c1=new Customer2(153,"Charles","Georgia",6700000000L);
		Customer2 c2=new Customer2(158,"Phillip","North Carolina",5900000000L);
		Customer2 c3=new Customer2(150,"Jose","Illinois",2500000000L);
		Customer2[] arr=new Customer2[3];
		arr[0]=c1;
		arr[1]=c2;
		arr[2]=c3;
		for(Customer2 obj: arr) {
			System.out.println(obj.display());
		}
	}
}
