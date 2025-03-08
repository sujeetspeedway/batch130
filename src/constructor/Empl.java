package constructor;

public class Empl {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		
		Speedway sp = new Speedway("Abhijeet",32);
		
		Speedway sp2 = new Speedway(sp);
		sp.display();
        sp2.display();
		
	}

}
class Speedway{
	
	String name;
	int age;
	
	Speedway(String n , int a){
		name = n;
		age = a ;
	}
	Speedway(Speedway s){
		name = s.name;
		age = s.age;
	}
	void display() {
		System.out.println("Name : "+name+" ,Age : "+age);
	}
}