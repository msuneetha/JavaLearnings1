package src.com.semanticsquare.basics;

class CurrencyConverter {

	double exchangeRates[] = {63.0,3.0,3.0,595,18,107,2}; 


	void setExchangeRates(double[] rates) {
	
	exchangeRates = rates;

	}

	void updateExchangeRates(int countryIndex, double newRate) {
	
	exchangeRates[countryIndex] = newRate;

	}

	double getExchangeRates(int countryIndex) {
	
	return exchangeRates[countryIndex];

	}

	double computeTransferAmount(int countryIndex, double amount) {
	
	return exchangeRates[countryIndex] * amount;

	}
	

	public void printCurrencies() {
	
	   /*System.out.println("rupee" + rupee);
	   System.out.println("$australian" + $australian);
	   System.out.println("dirham" + dirham);
	   System.out.println("real" + real);
	   System.out.println("_yen" + _yen);
	   System.out.println("chilean_peso" + chilean_peso);
	   System.out.println("mexican_peso" + mexican_peso);*/
	   System.out.println("exchange Rate India: " + exchangeRates[0]); 
	   System.out.println("exchange Rate dirham: " + exchangeRates[1]); 
	   System.out.println("exchange Rate Real: " + exchangeRates[2]);
	   System.out.println("exchange Rate chilean_peso: " + exchangeRates[3]);
	   System.out.println("exchange Rate mexican_peso: " + exchangeRates[4]);
	   System.out.println("exchange Rate yen: " + exchangeRates[5]); 
	   System.out.println("exchange Rate australian: " + exchangeRates[6]);
	   System.out.println("length of the exchange Rates: " + exchangeRates.length); 
	}


	/*public static void main(String[] args) {
	
		//CurrencyConverter cc = new CurrencyConverter();
		
		//exchangeRates = cc.getExchangeRates();

		//cc. printCurrencies();


	}*/

 
}