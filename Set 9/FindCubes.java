import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.List;
import java.util.Scanner;

class FindClass {
    public static List<Integer> getCubesOfFirstNNumbers(int n) {
        // Write your code here
        return IntStream.range(1, n+1).map(e -> e*e*e).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println(getCubesOfFirstNNumbers(number));

        sc.close();
    }
}