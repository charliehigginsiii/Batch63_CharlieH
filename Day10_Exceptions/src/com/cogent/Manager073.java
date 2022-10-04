package com.cogent;
class BankAccount{
	private int accNo;
	private String accHolderName;
	private double bal;
	
	public BankAccount(int accNo, String accHolderName, double bal) {
		super();
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.bal = bal;
	}

	void withdraw(int amt) {
		if(bal>=amt) {
			System.out.println("Please collect the cash");
			bal=bal-amt;
			System.out.println("Remaining balance is: "+bal);
		}else {
			throw new InsufficientBalanceException("Don't try to act smart");
		}
	}
}
public class Manager073 {
	public static void main(String[]args) {
		BankAccount bankAccount=new BankAccount(1234,"Rijo",2000);
		bankAccount.withdraw(3050);
	}

}
