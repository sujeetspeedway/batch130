package method;

public class Demo_Static_Var {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		
		Counter c1 = new Counter();
		Counter c2 = new Counter();
		c1.displayCount();
		c2.displayCount();
		
	}

}
class Counter{
	
	 static int count = 0 ;
	 
	 Counter(){
		 count++;
	 }
	 void displayCount() {
		 System.out.println("Count : "+count);
	 }
}