package finall;

public class Demo_Finally {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		System.out.println(methodWithFinally());
         
	}
	static String methodWithFinally() {
		try {
			return "This is From try Block";
		}
		finally {
			System.out.println("Finally block get executed");
		}
	}

}
