
import java.util.Scanner;

public class FindTheRightmostDigit {

    /**
     * This method finds the rightmost digit in a given string.
     *
     * @param str The string to find the rightmost digit in.
     * @return The rightmost digit in the string. If no digit is found, return -1.
     */
    public int getRightmostDigit(String str) {

        // Write your code here
        if(str == null || str.equals("")) {
            return -1;
        }
        for(int i = str.length()-1; i >= 0; i--) {
            if(Character.isDigit(str.charAt(i))) {
                return Character.getNumericValue(str.charAt(i));
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        FindTheRightmostDigit obj = new FindTheRightmostDigit();
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = obj.getRightmostDigit(str);
        if(result == -1) {
            System.out.println("String doesn't have any digit in it");
        }
        else {
            System.out.printf("String does have digit %d in it", result).println();
        }
    }
}