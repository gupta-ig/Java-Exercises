import java.util.Scanner;

public class StringMagic {
    
    /**
     * This method counts the number of uppercase letters in a given string.
     *
     * @param str The string to count uppercase letters in.
     * @return The number of uppercase letters in the string.
     */
    public int countUppercaseLetters(String str) {
        // Write your code here
        if(str == null) {
            return -1;
        }
        int count = 0;
        for(int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                count++;
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        StringMagic obj = new StringMagic();
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = obj.countUppercaseLetters(str);
        System.out.println("Number of uppercase characters is " + count);
        sc.close();
    }
}