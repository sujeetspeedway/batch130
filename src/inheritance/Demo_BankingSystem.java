package inheritance;

public class Demo_BankingSystem {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		SavingAccount saving = new SavingAccount();
		saving.BankDetils();
		saving.ShowAccountType();
		
		System.out.println("\n");
		
		CurrentAccount ca = new CurrentAccount();
		ca.BankDetils();
		ca.ShowAccountType();

		
		
	}

}
// Parent Class
class Banking{
	String bankName = "SBI Bank";
	
	void BankDetils() {
		System.out.println("Bank : "+bankName);
	}
}
class SavingAccount extends Banking{
	double intrestRate = 6.5;
	
	void ShowAccountType() {
		System.out.println("Account Type : Savings");
		System.out.println("Rate Of Intrest : "+intrestRate+" %");
	}
}
class CurrentAccount extends Banking {
	double draftLimit = 500000;
	
	void ShowAccountType() {
		System.out.println("Account Type : Current");
		System.out.println("Draft Limit  : $ "+draftLimit);
}
}