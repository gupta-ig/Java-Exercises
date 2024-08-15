import java.util.List;

public class SumOfSquares {
    public static long sumOfSquares(List<Integer> numbers) {
        
        // Check if the list is null. If so, return 0.
        if(numbers == null) {
            return 0;
        }

        // Stream over the list of numbers, find squares and sum them up
        return numbers.stream().mapToLong(n -> n*n).sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 4, 3, 5);

        System.out.println("Sum of numbers: " + sumOfSquares(numbers));
    }
}
