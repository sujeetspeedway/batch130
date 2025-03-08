package method;

public class Demo_Super2 {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Child1 c2 = new Child1();
		c2.display();

	}

}
class Parent1{
	String name = "Parent";
}
class Child1 extends Parent1{
	String name = "Chils";
	
	public void display() {
		System.out.println("Parent Name : "+super.name);
		System.out.println("Child Name : "+this.name);
	}
}