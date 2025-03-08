package finall;

public class Demo_Final_Method {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Banglore b1 = new Banglore();
		b1.display();

	}

}
class City{
	//final 
	void display() {
		System.out.println("This is Chennai");
	}
}
class Banglore extends City{
	void display() {
		System.out.println("This is Banglore");
	}
}