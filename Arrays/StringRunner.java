package ArrayQuestions;

public class StringRunner {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		String dayWithMostCharacters = "";
		for(String day:daysOfWeek) {
			if(day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;
			}
		}
		System.out.println("Day with most of the characters is: " + dayWithMostCharacters);

		for(int i = daysOfWeek.length-1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}
		
	}
}
