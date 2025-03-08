package finall;

public class Demo_Final_Class {

	public static void main(String[] args) {
		System.out.println("This is Beginning");
		One o1 = new One();
		o1.display();

	}

}
//final 
class One{
	public void display() {
		System.out.println("This is Banglore");
	}
}
class Two extends One{
	public void display() {
		System.out.println("This is Chennai");
	}
}