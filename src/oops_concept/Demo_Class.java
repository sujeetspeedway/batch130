package oops_concept;

public class Demo_Class {

	public static void main(String[] args) {
	
		int num = 1234 , rev = 0;
		
		System.out.println(num);
		System.out.println("This is Begnning");
		
		// run loop
		while(num != 0) {
			// get last digit form num
			int digit = num % 10 ;
			rev = rev * 10 + digit;
			
			num /= 10 ;
		}
		System.out.println("Reversed Number : "+rev);

	}

}
