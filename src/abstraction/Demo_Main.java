package abstraction;

public class Demo_Main {

		public static void main(String[] args) {
			BankAcc SavingAcc = new SavingAcc();
			SavingAcc.deposite(50000);
			SavingAcc.withdraw(20000);
			SavingAcc.displayBalance();
		}
	}