package access_modifier;

public class Demo_Default {

	public static void main(String[] args) {
      System.out.println("This is Beginning");
      
      ExampleDefault ed = new ExampleDefault();
      ed.display();
	}

}
class ExampleDefault{   // Visiable to classes within the same package
	
	String city = "This is Banglore"; 
	void display() {
		System.out.println(city);
	}
}