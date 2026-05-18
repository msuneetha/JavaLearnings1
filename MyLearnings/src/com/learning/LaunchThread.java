package com.learning;

public class LaunchThread {
	
	public static void main(String[] args) {
		
		System.out.println("main thread started");
		HSBCBank bank = new HSBCBank(4000);
		
		ATM a = new ATM(bank);
		PhonePe p = new PhonePe(bank);
		GooglePay g = new GooglePay(bank);
		
		Thread t = new Thread(a);
		t.setName("PhonePe");
		t.start();
		
		Thread b = new Thread(p);
		b.setName("ATM");
		b.start();
		
		Thread c = new Thread(g);
		c.setName("GooglePay");
		c.start();
		System.out.println("main thread ended");
		
		
	}

}
