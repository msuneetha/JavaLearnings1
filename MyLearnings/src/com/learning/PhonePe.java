package com.learning;

public class PhonePe extends Thread
{
	private HSBCBank bank;
	
	public PhonePe(HSBCBank bank) 
	{
		this.bank = bank;
		
	}
	
	@Override
	public void run() {
		System.out.println("inside phonepe");
		bank.deposit(4000);
	}

}
