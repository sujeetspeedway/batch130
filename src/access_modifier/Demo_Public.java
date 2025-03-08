package access_modifier;

public class Demo_Public {

	public static void main(String[] args) {
		
		System.out.println("This is Begnning");
		
		ExamplePublic ep = new ExamplePublic();
		ep.displayCity();

	}

}
class ExamplePublic{
	public String city = "This is Mumbai";
	
	public void displayCity() {
		System.out.println(city);
	}
}