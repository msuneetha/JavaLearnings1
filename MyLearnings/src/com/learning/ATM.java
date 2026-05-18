package com.learning;

public class ATM extends Thread
{
	private HSBCBank bank;
			
		public ATM(HSBCBank bank) {
			this.bank = bank;
			
		}
		@Override
		public void run() {
			System.out.println("inside ATM");
			bank.withDrawl(3000);
			
		}
}
