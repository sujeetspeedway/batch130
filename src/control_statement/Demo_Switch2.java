package control_statement;

public class Demo_Switch2 {

	public static void main(String[] args) {
		
		String month = "June";
		String season;
		
		switch(month) {
		case "Dec":
		case "jan":
		case "feb":
		season = "Winter";
		break;
		
		case "March":
		case "April":
		case "May":
		season = "Summer";
		break;
		
		case "June":
		case "July":
		case "Aug":
		season = "Spring";
		break;
		default:
			season = "Invaild month";
		}
		System.out.println("The season is : "+season);

	}

}
