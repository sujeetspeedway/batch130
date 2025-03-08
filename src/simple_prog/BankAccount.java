package simple_prog;

public class BankAccount {
	
	// instance variable
	String accountHolde;
	int accountNumber;
	double balance;
	
	
	// Static Variable
	static double intrestRate = 2.5;
	
	// Method to set account details
	public void setAccountDetails(String name , int accNumber , double initialbalance) {
		
		accountHolde = name;
		accountNumber = accNumber;
		balance = initialbalance;
	}
	
	// Method to deposite money
	public void deposite(double amount) {
		balance = balance + amount;
	}
	// Method to withdraw
	public void withdraw(double amount) {
		balance = balance - amount;
	}
	
	// method to display account details
	public void displayAccount() {
		System.out.println("Account Holder : "+accountHolde);
		System.out.println("Account Number : "+accountNumber);
		System.out.println("Balance : "+balance);
		System.out.println("Intrest rate : "+intrestRate+"%\n");
	}

	public static void main(String[] args) {
		
		
		BankAccount ba = new BankAccount();
		ba.setAccountDetails("sujeet", 12345, 50000);
		ba.deposite(20000);
		ba.withdraw(10000);
		ba.displayAccount();

		BankAccount ba2 = new BankAccount();
		ba2.setAccountDetails("Abhijeet", 54321, 100000);
		ba2.deposite(30000);
		ba2.withdraw(20000);
		ba2.displayAccount();

	}

}
