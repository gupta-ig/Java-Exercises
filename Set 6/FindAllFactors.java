import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FindAllFactors {

    /**
     * This method returns all factors of a given number in an ArrayList.
     * 
     * @param number the number to find factors of
     * @return a List of factors of the number
     */
    public static List<Integer> determineAllFactors(int number) {

        
        List<Integer> list = new ArrayList<Integer>();
        if(number <= 0) {
            return list;
        }
        
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(determineAllFactors(number));
    }
}
