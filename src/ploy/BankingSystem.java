package ploy;

public class BankingSystem {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Account1 acc ;
		acc = new SavingAcc();
		acc.processTransaction(10000);
		
		acc = new CurrentAcc();
		acc.processTransaction(30000);
		
		acc = new FDAcc();
		acc.processTransaction(50000);

	}

}
class SavingAcc implements Account1{

	@Override
	public void processTransaction(double amount) {
		System.out.println("This is Saving Account : "+amount);
		
	}
	
}
class CurrentAcc implements Account1{

	@Override
	public void processTransaction(double amount) {
		System.out.println("This is Current Account : "+amount);
		
	}
	
}
class FDAcc implements Account1{

	@Override
	public void processTransaction(double amount) {
		
		System.out.println("This is FD Account : "+amount);
		
	}
	
}