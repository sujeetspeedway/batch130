package method;

public class Demo_Method_Over {

	public static void main(String[] args) {
		 
		Printer p1 = new Printer();
		p1.print(100 , "Abhijeet");
		p1.print("Sujeet");
		p1.print(99.99);

	}

}
class Printer{
	
	public void print(int number , String name) {
		System.out.println("Number : "+number+" , "+name);
	}
	public void print(String text) {
		System.out.println("Text : "+text);
	}
	public void print(double value) {
		System.out.println("Double : "+value);
	}
}