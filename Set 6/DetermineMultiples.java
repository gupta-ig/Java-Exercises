import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DetermineMultiples {
    /**
     * This method generates a list of multiples of a given number less than a specified limit.
     * 
     * @param number the number to find multiples of
     * @param limit the upper bound for the multiples
     * @return a List of multiples of the number less than the limit
     */
    public static List<Integer> determineMultiples(int number, int limit) {

        List<Integer> multiples = new ArrayList<Integer>();
        
        if(number <= 0 || limit <= 0) {
            return multiples;
        }
        for(int i = 1; i*number < limit; i++) {
            multiples.add(i*number);
        }
        return multiples;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();

        System.out.println(determineMultiples(number, limit));

        sc.close();
    }
}