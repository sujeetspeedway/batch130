package method;

public class Demo_Static4 {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		
		OuterCLass.NestedClass nc = new OuterCLass.NestedClass();
		nc.display();

	}

}
class OuterCLass{
	static int outerStaticVar = 10;
	
	static class NestedClass{
		void display() {
			System.out.println("Outer static variable : "+outerStaticVar);
		}
	}
}