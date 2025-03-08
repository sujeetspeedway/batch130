package method;

public class Demo_Static_Method {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		
		int sum = MathOperation.add(5, 10);
		int product = MathOperation.multiply(5, 10);
		
		System.out.println("Sum : "+sum);
		System.out.println("Product : "+product);

	}

}
class MathOperation{
	
	static int add(int a , int b) {
		return a + b;
	}
	static int multiply(int a , int b) {
		return a * b;
	}
}