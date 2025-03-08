package control_statement;

public class Demo_ForLoop {

	public static void main(String[] args) {
		
		String actual = "Selenium by sujeet";
		
		System.out.println(actual);
       char arr[] = actual.toCharArray();
       int len = actual.length();
       System.out.println("This is Length of String : "+len);
       
       for(int i = len-1 ; i>=0 ; i--) {
    	   System.out.print(arr[i]);
       }
	}
}
