package constructor;

public class Demo_Param_Const {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
		
		Emp e1 = new Emp(101,"Sujeet");

	}

}
class Emp{
	
	Emp(int id , String name){
		System.out.println("This is Employee Constructor");
		System.out.println(id+" "+name);
	}
}