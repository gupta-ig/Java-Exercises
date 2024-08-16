package functional;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = List.of(4, 6, 8, 13, 2, 15);
		
		numbers.stream().forEach(element -> System.out.println(element * element));
		
		numbers.stream().forEach(element -> System.out.println(element));
		
		//int sum = normalSum(numbers);
		fpSum(numbers);
	}

	private static void fpSum(List<Integer> numbers) {
		int sum = numbers.stream().reduce(0, (number1, number2) -> number1 + number2);
		System.out.println(sum);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum = 0;
		for(int i : numbers) {
			sum += i;
		}
		return sum;
	}
	
	
	
}
