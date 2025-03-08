package string_pck;

public class Demo_StringBuffer {

	public static void main(String[] args) {
		
		//1. Append 
		StringBuffer sb = new StringBuffer("This is Banglore");
		sb.append("---> This is Chennai");
		System.out.println(sb);
		
		String str = new String("This is Banglore");
		str=str.concat("   This is Chennai");
		System.out.println(str);
		
		// 2. insert
		sb.insert(5, "Pune  ");
		System.out.println(sb);
		
		// 3. replace
		sb.replace(0, 5,"Abhijeet  ");
		System.out.println(sb);
		
		// 4. delete
		sb.delete(0,8);
		System.out.println(sb);
		
		// 5. reverse
		sb.reverse();
		System.out.println(sb);
		

	}

}
