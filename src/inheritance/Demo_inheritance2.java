package inheritance;

public class Demo_inheritance2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Car2 c2 = new Car2("TATA ",5);
		
		Bike b1 = new Bike("Royal Enfield",70);
		
		System.out.println("Car Info");
		c2.displayCarInfo();
		
		System.out.println("\n Bike Info");
		b1.displayBikeInfo();

	}

}
// Parent
class Vehicel2{
	private String brand;
	
	// constructor
	public Vehicel2(String brand) {
		this.brand=brand;
		
	}
	// Method
	public void displayInfo() {
		System.out.println("Brand Name : "+brand);
	}
}
// child-1
class Car2 extends Vehicel2{
	 
	private int doors;
	
	public Car2(String brand , int doors){
		super(brand);
		this.doors=doors;
	}	
	public void displayCarInfo() {
		displayInfo();
		System.out.println("Doors : "+doors);
	}
	}
// child-2
class Bike extends 	Vehicel2{
	private int speed;
	public Bike(String brand , int speed) {
		super(brand);
		this.speed=speed;
	}
	public void displayBikeInfo() {
		displayInfo();
		System.out.println("Bike Speed : "+speed);
	}
}