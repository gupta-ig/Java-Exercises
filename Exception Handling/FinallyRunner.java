package exceptionalHandling;

import java.util.Scanner;

public class FinallyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = null;
		try {
			scanner = new Scanner(System.in);
			int[] numbers = {12, 3, 4, 5};
	 	
			int number = numbers[32];
			System.out.println(number);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Before Scanner Close");
			if(scanner != null) {
				scanner.close();
			}
		}
		System.out.println("Just before closing out main");
	}

}
