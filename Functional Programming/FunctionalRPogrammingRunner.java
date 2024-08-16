package functional;

import java.util.List;

public class FunctionalRPogrammingRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		
		printWithFPFiltering(list);
 	}

	private static void printBasic(List<String> list) {
		for(String string : list) {
			System.out.println(string);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
	}
	
	private static void printBasicWithFiltering(List<String> list) {
		for(String string : list) {
			if(string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}
	
	private static void printWithFPFiltering(List<String> list) {
		list.stream().filter(
				element -> element.endsWith("at")
				)
		.forEach(element -> System.out.println(element));
	}

}
