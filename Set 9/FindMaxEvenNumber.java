import java.util.List;

public class FindMaxEvenNumber {
    public static int findMaxEvenNumber(List<Integer> numbers) {
        // Write your code here 
        if(numbers == null) {
            return 0;
        }
        return numbers.stream().filter(n -> n%2 == 0).max(Integer::compare).orElse(0);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(723564, 89783, 934735, 376463,94384920);

        System.out.println("Maximum even number: " + findMaxEvenNumber(numbers));
    }
}
