package control_statement;

public class Demo_Fact {

	public static void main(String[] args) {
		
          int a , f = 1;
          int num = 5;
          
          for(a=1;a<=num;a++) {
        	  f=f*a;
          }
          System.out.println("Factorial of "+num+" is = "+f);
	}

}
