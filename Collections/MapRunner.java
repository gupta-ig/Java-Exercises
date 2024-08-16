package CollectionPackage;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is an awesome occasion. " + "This has never happened before.";
		
		Map<String, Integer> stringOccurrences = new HashMap<>();
		String[] words = str.split(" ");
		
		for(String word : words) { 
			Integer integer = stringOccurrences.get(word);
			if(integer == null) {
				stringOccurrences.put(word, 1);
			}
			else { 
				stringOccurrences.put(word, integer + 1);
			}
		}
		System.out.println(stringOccurrences);
		/*
		Map<Character, Integer> occurrences = new HashMap<>();
		
		char[] characters = str.toCharArray();
		for(char character : characters) {
			//Get the character
			Integer integer = occurrences.get(character);
			if(integer == null) {
				occurances.put(character, 1);
			}
			else {
				occurances.put(character, integer + 1); 
			}
		}
		System.out.println(occurrences);
		*/
	}

}
