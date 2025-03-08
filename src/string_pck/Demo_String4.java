package string_pck;

public class Demo_String4 {

	public static void main(String[] args) {
		
		String str = "Selenium";
		
		/*int len = str.length();
		System.out.println(len);
		char ch[]=str.toCharArray();
		
		for(int i = len-1 ; i>=0 ; i--) {
			System.out.print(ch[i]);*/
		
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse().toString());
		
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println(sb1.reverse().toString());
		}
		

	}
