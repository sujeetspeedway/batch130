package demo;

public class One {

	public static void main(String[] args) {
		
		System.out.println("This is Beginning");
          
		Two t2 = new Two();
		t2.Banglore();
		
		Three t3 = new Three();
		t3.Chennai();
		
		Four f4 = new Four();
		f4.Pune();
		
		Five f5 = new Five();
		f5.Mumbai();
		
	}

}
class Two{
	public void Banglore() {
		System.out.println("This is Banglore");
	}
}
class Three{
	public void Chennai() {
		System.out.println("This is Chennai");
	}
}
class Four{
	public void Pune() {
		System.out.println("This is Pune");
	}
}
class Five{
	public void Mumbai() {
		System.out.println("This is Mumbai");
	}
}

