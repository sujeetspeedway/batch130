package abstraction;

interface BankAcc {
    void deposite(double amount);
    void withdraw(double amount);
    void displayBalance();
}
public class SavingAcc implements BankAcc {
	private double balance;

	@Override
	public void deposite(double amount) {
	     balance += amount;
	     System.out.println("Deposite :"+amount+"Saving Account");
		
	}

	@Override
	public void withdraw(double amount) {
		if(balance >=amount) {
			balance -=amount;
			System.out.println("Withdraw :"+amount+"From Saving Account");
		}
		else {
			System.out.println("Insufficient amount");
		}
		
	}
	@Override
	public void displayBalance() {
		System.out.println("Current Balance is Saving Account : "+balance);
		
	}

}
