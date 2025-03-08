package constructor;

public class Demo_Def_Const {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		
		Employee e1 = new Employee();

	}

}
class Employee{
	
	int id;
	String name;{
		System.out.println(id+" "+name);
	}
}