package method;

public class Demo_Method2 {

	public static void main(String[] args) {
	   
		System.out.println("This is Begining");
		
		City c1 = new City();
		
		c1.banglore();
		c1.chennai();
		c1.pune();
		c1.mumbai();
	}

}
class City{
	public void banglore() {
		System.out.println("This is Banglore");
	}
	public void chennai() {
		System.out.println("This is Chennai");
	}
	public void pune() {
		System.out.println("This is Pune");
	}
	public void mumbai() {
		System.out.println("This is Mumbai");
	}
	City(){
		System.out.println("This is default city");
	}
}