package simple_prog;

import java.util.Scanner;

public class Demo_Scanner {

	public static void main(String[] args) {
		
		// creating object of Scanner Class
		
		Scanner sc = new Scanner(System.in);
		
		// Taking a user input
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		
		System.out.println("Enter your Salary : ");
		
		double salary = sc.nextDouble();
		
		// Display Output
		System.out.println("\n ===== User Details ====");
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Salary : "+salary);
        
        sc.close();
	}

}
