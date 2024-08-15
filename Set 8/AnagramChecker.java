import java.util.Arrays;

public class AnagramChecker {

    public static boolean areAnagrams(String str1, String str2) {
    
        // Write your code here
        if(str1 == null || str2 == null) {
            return false;
        }
        if(str1.length() != str2.length()) {
            return false;
        }
        String lowerCaseStr1 = str1.toLowerCase();
        String lowerCaseStr2 = str2.toLowerCase();
        
        char[] char1 = lowerCaseStr1.toCharArray();
        char[] char2 = lowerCaseStr2.toCharArray();
        
        Arrays.sort(char1);
        Arrays.sort(char2);
        
        boolean result = Arrays.equals(char1, char2);
        return result;
    }

    public static void main(String[] args) {
        String str1 = "People";
        String str2 = "PEOPLE";

        System.out.println(areAnagrams(str1, str2)? "Yes" : "No");
    }
}