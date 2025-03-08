package ploy;

public class Demo_poly2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		City c1 = new Mumbai();
		City c2= new Pune();
		City c3 = new Banglore();
		City c4 = new Chennai();
		
		c1.showCity();
		c2.showCity();
		c3.showCity();
		c4.showCity();
		
		Chennai ch = new Chennai();
		ch.Goa();

	}

}
class City{
	void showCity() {
		System.out.println("This is a city");
	}
}
class Mumbai extends City{
	void showCity() {
		System.out.println("This is Mumbai");
	}
}
class Pune extends City{
	void showCity() {
		System.out.println("This is Pune");
	}
}
class Banglore extends City{
	void showCity() {
		System.out.println("This is Banglore");
	}
}
class Chennai extends City{
	void showCity() {
		System.out.println("This is Chennai");
	}
	public void Goa() {
		System.out.println("This is GOA");
	}
}