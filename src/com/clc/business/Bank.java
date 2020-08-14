package com.clc.business;

public class Bank {
	private int amount = 50000;
	private String accountNo = "AC123";
	
	public int depositCash(String ac, int amt) {
		System.out.println("Now depositing!!");
		if(ac.equals(this.accountNo)) {
			 this.amount = this.amount +  amt;
			 return this.amount;
		}
		else {
			return 0;
		}
		
	}

}
