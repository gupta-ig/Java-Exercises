import java.util.List;
import java.util.stream.Collectors;

public class FilterOddNumbers {
    public List<Integer> filterOddNumbers(List<Integer> numbers) {
        
        // Write your code here
        return numbers.stream().filter(number -> number%2 != 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        FilterOddNumbers obj = new FilterOddNumbers();
        List<Integer> list = List.of(23, 45, 67, 46, 87);

        System.out.println(obj.filterOddNumbers(list));
    }
}
