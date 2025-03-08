package inheritance;

public class Demo_Inheritance {

	public static void main(String[] args) {
	
		System.out.println("This is Beginning");
		
		ElectricCar ev = new ElectricCar("TATA", 4, 75);
		ev.displayElectricCarInfo();
		

	}

}
// Super Class
class Vehicle{
	
	private String brand;
	
	public Vehicle(String brand) {
		this.brand=brand;
	}
	
	public void displayInfo() {
		System.out.println("Brand Name : "+brand);
	}
}
// Sub Class
class Car extends Vehicle{
	
	private int doors;
	public Car(String brand , int doors) {
		super(brand);
		this.doors = doors;
	}
	
	public void displayCarInfo() {
		super.displayInfo();
		System.out.println("Doors : "+doors);
}
}
class ElectricCar extends Car{
	  private int batterCapacity;
	  
	  public ElectricCar(String brand , int doors , int batterCapacity ) {
		  super(brand , doors);
		  this.batterCapacity = batterCapacity;
	  }
	  public void displayElectricCarInfo() {
		  displayCarInfo();
		  System.out.println("Battery Capacity : "+batterCapacity + "KWh");
	  }
}

