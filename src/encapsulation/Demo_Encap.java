package encapsulation;

public class Demo_Encap {

	public static void main(String[] args) {
	  System.out.println("This is Beginning");
	  
	  Employee e1 = new Employee();
	  e1.setName("Abhi");
	  e1.setAge(30);
	  
	  System.out.println("Name : "+e1.getName());
	  System.out.println("Age : "+e1.getAge());
	}

}
class Employee{
	
	private String name;
	private int age;
	
	// Getter method for 'name'
	public String getName() {
		return name;
	}
	  // Setter method for 'name'
	public void setName(String name) {
		this.name=name;
	}
	// Getter method for 'age'
	public int getAge() {
		return age;
	}
	  // Setter method for 'age'
	public void setAge(int age) {
		if(age > 0) {
			this.age=age;
		}
		else {
			System.out.println("Invalid Age");
		}
	}
	} 

