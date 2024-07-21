import java.util.Scanner;

public class StringMagic2 {

    /**
     * This method checks if a given string has two consecutive identical characters.
     *
     * @param str The string to check for consecutive duplicates.
     * @return true if the string has consecutive duplicates, false otherwise.
     */
    public boolean hasConsecutiveDuplicates(String str) {
        
        // Write your code here
        if(str == null) {
            return false;
        }
        for(int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringMagic2 obj = new StringMagic2();
        if(obj.hasConsecutiveDuplicates(str)) {
            System.out.println("String has duplicate characters");
        }
        else { 
            System.out.println("String does not have duplicate characters");
        }
    }
}