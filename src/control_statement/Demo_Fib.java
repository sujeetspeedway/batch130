package control_statement;

public class Demo_Fib {

	public static void main(String[] args) {
		
		int a = 0 ;
		
		int b = 1 ;
		
		int c = 10 ;
		
		System.out.print(a+" "+b);
		
		for(int i = 2 ; i<=c ;i ++) {
			
			int d = a+b;
			System.out.print(" "+d);
			a=b;
			b=d;
			
		}
	}
}
