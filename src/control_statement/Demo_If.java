package control_statement;

public class Demo_If {

	public static void main(String[] args) {
		
	   String actual = "ABCD";
	   
	   String expected = "ABcd";
		
		if(actual.equalsIgnoreCase(expected)) {
			
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}

	}

}
