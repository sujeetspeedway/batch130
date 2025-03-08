package method;

public class Demo_This {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		
		Employee e1 = new Employee();
		e1.display(101,"Sujeet");
		
		Cite c1 = new Cite();
		c1.chennai();
		
		Student s1 = new Student();
	
		Car c2 = new Car();
		c2.getDetails();

	}

}
class Employee{
	int id ;
	String name;
	
	public void display(int id , String name) {
		this.id=id;   // "this.id" refers to instance variable
		this.name=name;
		System.out.println(id+" "+name);
	}
}
class Cite{
	public void banglore() {
		System.out.println("This is Banglore");
		//this.chennai();
	}
	public void chennai() {
		System.out.println("This is Chennai");
		this.banglore(); // "this keyword refers to current class method"
	}
}
class Student{
	Student(){
		this(10); // this refers to constructor with argument
	}
	Student(int value){
		System.out.println("Value : "+value);
	}
}
class Car{
	  Car getDetails() {
		  System.out.println("TATA Motors");
		  return this; // this refers to current class Object
	  }
}