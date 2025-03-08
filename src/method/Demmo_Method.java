package method;

public class Demmo_Method {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Calculator cl = new Calculator();
		System.out.println("Sum : "+cl.add(5, 5));

	}

}
class Calculator{
	  int add(int a , int b) {
		  return a + b;
	  }
}