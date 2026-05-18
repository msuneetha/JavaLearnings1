package com.learning;

public class GooglePay extends Thread
{
	private HSBCBank bank;
	
	public GooglePay(HSBCBank bank) {
		this.bank = bank;
	}
	
	@Override
	public void run() {
		System.out.println("Google pay");
		bank.balanceCheck();
	}

}
