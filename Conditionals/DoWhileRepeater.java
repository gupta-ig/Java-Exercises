package conditionals;

import java.util.Scanner;

public class DoWhileRepeater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		do {
			System.out.print("Enter a number ");
			number = sc.nextInt();
			System.out.println("Cube is " + number*number*number);
		}while(number >= 0);
		System.out.println("Thank You! Have Fun!");
	}

}
