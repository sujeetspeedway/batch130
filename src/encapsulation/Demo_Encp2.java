package encapsulation;

public class Demo_Encp2 {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		BankAccount Acc = new BankAccount(10000);
		System.out.println("Initial Balance : "+Acc.getBalance());
		
		// Deposite
		Acc.deposite(4000);
		
		System.out.println("Current Balance : "+Acc.getBalance());
		
		Acc.withdraw(5000);
		System.out.println("Available Balance : "+Acc.getBalance());
		
		Acc.withdraw(10000);
		
		System.out.println("Remain Balance : "+Acc.getBalance());

	}

}
class BankAccount{
	private double balance;
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	public double getBalance() {
		return balance;
	}
	// Method to deposite money
	public void deposite(double amount) {
		if(amount > 0 ) {
			balance += amount;
			System.out.println("Amount Deposited : "+amount);
		}
		else {
			System.out.println("Amount to deposite must be positive");
		}
	}
	// Method to withdraw
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Amount Withdraw : "+amount);
		}
		else {
			System.out.println("Invalid amount or insufficient balance ");
		}
	}
}