package access_modifier;

public class Demo_Private {

	
	// Private: Visiable only within the same class
	public static void main(String[] args) {
		System.out.println("This is Beginning");
		
		ExamplePrivate ep = new ExamplePrivate();
		//ep.displayCity();
		ep.accessCity();

	}

}
class ExamplePrivate{
	private String city = "This is Chennai";
	
	private void displayCity() {
		System.out.println(city);
	}
	void accessCity() {
	displayCity(); // Allowed , private method aceesessed within the same class
	}
}