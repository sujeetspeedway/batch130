package demo;

import demopck.Nine;

public class Six {

	public static void main(String[] args) {
		
		Seven s7 = new Seven();
		s7.Banglore();
		s7.chennai();
		s7.Pune();
		
		Eight e8 = new Eight();
		e8.Delhi();
		
		Nine n9 = new Nine();
		n9.USA();

	}

}
class Seven{
	public void Banglore() {
		System.out.println("This is Banglore");
	}
	public void chennai() {
		System.out.println("This is Chennai");
	}
	public void Pune() {
		System.out.println("This is Pune");
	}
}