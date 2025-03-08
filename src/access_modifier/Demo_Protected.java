package access_modifier;

public class Demo_Protected {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
        
		//ExampleProtected ep = new ExampleProtected();
				//ep.displayCity();
		
		SubClass sc = new SubClass();
		sc.showCity();
	}

}
class ExampleProtected{
	protected String city = "This is Pune";
	
	protected void displayCity() {
		System.out.println(city);
	}
}
class SubClass extends ExampleProtected{
	public void showCity() {
		displayCity();   // 
	}
}