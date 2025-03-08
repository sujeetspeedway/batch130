package string_pck;

public class Demo_String3 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		String str = "This is Chennai";  // SCP
		
		// 1.String length
		int len = str.length();
		System.out.println("Lengthof String is = "+len);
		
		//2. char at index
		System.out.println("Charcter at index = "+str.charAt(5));
		
		// 3.Sub String
		System.out.println("String Sub String = "+str.substring(0,6));
		
		// 4. Concat 
		String str2 = "  Welcome"; //---- SCP
		      str2=str.concat(str2);
		      System.out.println(str2);
		      
		// 5.Equal
		 String str3 = "This is Chennai";
		 System.out.println(str3 == str);
		 System.out.println(str3.equals(str));
		 String str4 = new String("This is Chennai");
		 System.out.println(str3.equals(str4)); // ----> content
		 System.out.println(str3==str4); // -------> reference
		 
		 // 6 Compare To
		 String str5 = "ABCD";  // 1 2 3 4
		 String str6 ="ABCD";  // 1 2 3 4
		 String str7 = "DCBA";//- 4 3 2 1 
		 System.out.println(str5.compareTo(str6));
         System.out.println(str6.compareTo(str7));
         
         // 7. Upper Case
         String str8 = "this is pune";
         System.out.println(str8.toUpperCase());
         
         // 8 . Lower Case
         String str9 = "THIS IS MUMBAI";
         System.out.println(str9.toLowerCase());
         
         // 9. Trim
         String str10 ="          This is Goa               ";
         System.out.println(str10.trim()+" my city ");
         
         // 10 Replace
         String str11 = "This is java";
         System.out.println(str11.replace('j','k'));
         
         // 12. StartWith
         String str12 = "Hello Sujeet";
         System.out.println(str12.startsWith("He"));
         System.out.println(str12.endsWith("eet"));
         
         
	}

}
