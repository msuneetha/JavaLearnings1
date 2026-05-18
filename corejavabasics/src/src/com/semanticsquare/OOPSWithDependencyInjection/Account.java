package src.com.semanticsquare.OOPSWithDependencyInjection;

//This is the parent class which demonstrates Encapsulation and Abstraction
public abstract class Account {
	
	private String accountType;
	private String accountNumber;
	private String typeOfTransaction;
	
	public String getAccountType() {
		return accountType;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public String getTypeOfTransaction() {
		return typeOfTransaction;
	}

	public void setTypeOfTransaction(String typeOfTransaction) {
		this.typeOfTransaction = typeOfTransaction;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	abstract double calculateAmount();
	
	 public void deposit(String accountType, double amount) {
		 
		 double resultBalance = getBalance() + amount;
		 System.out.println("The result balance is " + resultBalance);
	 }
	 double withdraw(String accNumber, double amountToWithdraw ) {
		double balance =  getBalance(accNumber);
		double remaining_balance = balance - amountToWithdraw;
		if(remaining_balance > 0) {
			System.out.println("successfully withdrawn the amount");
		}else {
			System.out.println("Cannot withdraw more than the available balance");
		}
			
	 }
	 
	 double getBalance(String accNumber);
	 double fundTransfer(String sourceAccNumber, String destAccNumber);
}
