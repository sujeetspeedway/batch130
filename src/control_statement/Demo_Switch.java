package control_statement;

public class Demo_Switch {

	public static void main(String[] args) {

		int day = 8 ;

		String dayName;

		// Switch statement to print the day of the week
		switch(day) {
		case 1:
			dayName ="Monday";
			break;
		case 2:
			dayName = "Tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
		case 7:
			dayName = "Sunday";
			break;	
		default:
			dayName = "INvaild Day";
		}
		System.out.println("The day is : "+dayName);
	}
}