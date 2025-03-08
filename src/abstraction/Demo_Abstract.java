package abstraction;

public class Demo_Abstract {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		//int amount = 10000;
		
		Payment atm = new ATMPayment();
		Payment cc = new CreditCard();
		Payment dc = new DebitCard();
		
		System.out.println("ATM Payemet : ");
		atm.makePayment(2000);
		atm.showPaymentInfo();
		
		System.out.println("\n");
		System.out.println("Credit Card Payment : ");
		cc.makePayment(4000);
		cc.showPaymentInfo();
		 
		System.out.println("\n");
		System.out.println("Debit Card Payment ...");
		dc.makePayment(50000);
		dc.showPaymentInfo();

	}

}
// Abstract keyword
abstract class Payment{
	// Abstract method to process payment
	abstract void makePayment(int amount);
	
	public void showPaymentInfo() {
		System.out.println("Processing Payment . plz wait ....");
	}
}
class ATMPayment extends Payment{

	@Override
	void makePayment(int amount) {
		System.out.println("Payment of Rs. "+amount+"   made by Using ATM");
		
	}
	
}
class CreditCard extends Payment{

	@Override
	void makePayment(int amount) {
		System.out.println("Payment of Rs . "+amount+"   made by using CreditCard");
		
	}
}
class DebitCard extends Payment{

	@Override
	void makePayment(int amount) {
		System.out.println("Payment of Rs . "+amount+"made by using DebitCard");
		
	}
	
}