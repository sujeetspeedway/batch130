package method;

public class Demo_Static_Block {

	public static void main(String[] args) {
	
		System.out.println("This is Begining");
		
		Speedway.displayValue();

	}

}
class Speedway{
	
	static int value;
	
	static {
		value = 77 ;
		System.out.println("This is Static block");
	}
	static void displayValue() {
		System.out.println("Value of block is : "+value);
	}
}