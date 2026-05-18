package src.com.semanticsquare.basics;

class MoneyTransferService {
	
	CurrencyConverter cc = new CurrencyConverter();

	double computeTransferAmount(int countryIndex, double amount) {
	    
	   return cc.computeTransferAmount(countryIndex, amount);
	}

	double computeTransferFee(int countryIndex, double amount) {
	    
	   return computeTransferAmount(countryIndex, amount) * 0.02;
	}

	public static void main(String[] args) {
	
	MoneyTransferService mts = new MoneyTransferService();
	
	 double amount = mts.computeTransferAmount(0,1000);
	
	 System.out.println("Transfer amount: " + amount);

	 double fee = mts.computeTransferFee(0, 1000);

	System.out.println("Transfer fee: " + fee);
	 
	
	}
	
}