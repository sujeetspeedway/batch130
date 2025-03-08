package ploy;

public class BankingSyatem {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		Account acc;
		acc = new SavingAccount();
		acc.processTransaction(100000);
		
		acc = new CurrentAccount();
		acc.processTransaction(200000);
		
		acc = new FDAccount();
		acc.processTransaction(7000);

	}

}
class Account{
	 
	public void processTransaction(double amount) {
		System.out.println("Transaction of "+amount+"processed");
	}
}
class SavingAccount extends Account{
	public void processTransaction(double amount) {
		System.out.println("Saving Account : withdrawn "+amount);
	}
}
class CurrentAccount extends Account{
	public void processTransaction(double amount) {
		System.out.println("Current Account : withdrawn "+amount);
	}
}
class FDAccount extends Account{
	public void processTransaction(double amount) {
		System.out.println("FD Deposite Account : "+amount);
	}
}