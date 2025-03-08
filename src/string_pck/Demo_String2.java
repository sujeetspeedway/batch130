package string_pck;

public class Demo_String2 {

	public static void main(String[] args) {
	 
		String str1 = "Java";  // ----- SCP
		
		String str2 = "Java"; // -----> I am going str1
		
		String str3 = new String("Java"); // -----> Heap
		
	   System.out.println(str1);
	   System.out.println(str3);
	   
	   System.out.println(str1 == str2);
	   System.out.println(str2 == str3);    // reference comp.
	   
	   System.out.println(str2.equals(str3)); // .equal is for content comp.
		

	}

}
