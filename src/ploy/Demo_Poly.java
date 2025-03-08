package ploy;

public class Demo_Poly {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Calculator c1 = new Calculator();
		int d =c1.add(10, 20);
		System.out.println(d);
		
		int f =c1.add(20, 30, 40);
		System.out.println(f);
		
		int b =c1.add(30, 40);
		System.out.println(b);
		
		c1.chennai();
		

	}

}
class Calculator{
	
	// Method
	int add(int a , int b) {
		return a + b;
	}
	// Overload
	int add(int a , int b , int c) {
		return a + b + c;
	}
	double add(double a , double b) {
		return a + b;
	}
	public void chennai() {
		System.out.println("This is Chennai");
	}
}