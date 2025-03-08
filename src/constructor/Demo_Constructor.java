package constructor;

public class Demo_Constructor {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		BankAccount BA1 = new BankAccount("Sujeet",5000);
		BankAccount BA2 = new BankAccount("Abhijeet",10000);
		
		BA1.displayAccountDetails();
		BA2.displayAccountDetails();
		
		

	}

}
class BankAccount{
	
	String AccountName;
	double Balance;
	
	BankAccount(String Name , double Bal){
		AccountName = Name;
		Balance = Bal;
	}
	void displayAccountDetails() {
		System.out.println("Account Holde : "+AccountName);
		System.out.println("Balance : $ "+Balance);
	}
}