package method;

public class Demo_Super {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Child c1 = new Child();
		//c1.show();
		//c1.display();

	}

}
class Parent{
	//public void display() {
	Parent(){ //                          --- Constructor
		System.out.println("This is Parent class Method");
	}
}
class Child extends Parent{
	//public void display() {
	Child(){ 
		super();
		// 
		System.out.println("This is Chils class Method");
	}
	//public void show() {
		//super();
		
	}
