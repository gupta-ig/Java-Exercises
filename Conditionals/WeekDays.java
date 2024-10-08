package conditionals;

import java.util.Scanner;

public class WeekDays {
	
	private static void determineNameOfDay(int dayNumber) {
		switch(dayNumber) {
		case 0: {
			System.out.println("Sunday");
			break;
		}
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		case 4: {
			System.out.println("Thursday");
			break;
		}
		case 5: {
			System.out.println("Friday");
			break;
		}
		case 6: {
			System.out.println("Saturday");
			break;
		}
		default: {
			System.out.println("Wrong Choice");
			break;
		}
		}

	}
	
	public static void determineNameOfMonth(int monthNumber) {
		switch(monthNumber) {
		case 1: {
			System.out.println("January");
			break;
		}
		case 2: {
			System.out.println("February");
			break;
		}
		case 3: {
			System.out.println("March");
			break;
		}
		case 4: {
			System.out.println("April");
			break;
		}
		case 5: {
			System.out.println("May");
			break;
		}
		case 6: {
			System.out.println("June");
			break;
		}
		case 7: {
			System.out.println("July");
			break;
		}
		case 8: {
			System.out.println("August");
			break;
		}
		case 9: {
			System.out.println("September");
			break;
		}
		case 10: {
			System.out.println("October");
			break;
		}
		case 11: {
			System.out.println("November");
			break;
		}
		case 12: {
			System.out.println("December");
			break;
		}
		default: {
			System.out.println("Wrong Choice");
			break;
		}
		}
	}
	public static boolean isWeekDay(int dayNumber) {
		 switch(dayNumber) {
		 case 0: return false;
		 case 1: return true;
		 case 2: return true;
		 case 3: return true;
		 case 4: return true;
		 case 5: return true;
		 case 6: return false;
		 }
		 return false;
	}
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		int dayNumber = sc.nextInt();
//		int monthNumber = sc.nextInt();
		System.out.println(isWeekDay(0));
		determineNameOfMonth(11);
		determineNameOfDay(4);
	}

}

