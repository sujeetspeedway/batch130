package constructor;

public class Demo_Const_Over {

	public static void main(String[] args) {
		
		System.out.println("This is Begining");
		Employe e1 = new Employe(101,"Sujeet");
		Employe e2 = new Employe(102,"Abhijeet",9098776655l);
		Employe e3 = new Employe(103,"Jeet",9890112233l,"COMP");
		
		e3.Employe();
	}

}
class Employe{
	   int id ;
	   long mob;
	   String name;
	   String Dept;
	   String Address;
	   
	   Employe(int i , String n){
		   id=i;
		   name=n;
		   System.out.println(i+" "+n);
	   }
	   Employe(int i , String n , long m){
		   id=i;
		   name=n;
		   mob = m;
		   System.out.println(i+" "+n+" "+m); 
	   }
	   Employe(int i , String n , long m , String d){
		   id=i;
		   name=n;
		   mob = m;
		   Dept = d;
		   System.out.println(i+" "+n+" "+m+" "+d); 
	   }
	   public void Employe() {
		   System.out.println("This is Employee");
	   }
	   
}