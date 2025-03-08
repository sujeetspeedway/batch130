package encapsulation;

public class Demo_Enca1 {

	public static void main(String[] args) {
	  
		City c1 = new City("Chennai " , 10000);
		City c2 = new City("Pune " , 20000);
		
		c1.displayCityInfo();
		c2.displayCityInfo();
		
		// Modify 
		c1.setPopulation(150000);
		System.out.println("Updated population of "+c1.getCityName()+" : "+c1.getPopulation());
		

	}

}
class City{
	private String cityName;
	private int population;
	
	// constructor
	public City(String cityName , int population) {
		this.cityName = cityName;
		this.population = population;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}
	// Method to display the city info
	public void displayCityInfo() {
		System.out.println("City : "+cityName+" , Population : "+population);
	}
}