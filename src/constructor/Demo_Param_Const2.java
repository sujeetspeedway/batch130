package constructor;

public class Demo_Param_Const2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Car c1 = new Car("TATA","Black",2024);
		
		Cite c2 = new Cite();
		
		c2.banglore();

	}

}
class Car{
	Car(String model , String color , int year){
		
		System.out.println(model+" "+color+" "+year);
	}
}
class Cite{
	
	public void banglore() {
		System.out.println("This is Banglore");
	}
	
}