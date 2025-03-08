package abstraction;

public class One {
           
	public static void main(String[] args) {
		System.out.println("This is Beginning");

		Two t2 = new Two();
		t2.city();
	}

}
class Two{
	  void city() {
		  System.out.println("This is Chennai");
		  System.out.println("This is Banglore");
		  System.out.println("This is Pune");
		  System.out.println("This is Mumbai");
	  }
}