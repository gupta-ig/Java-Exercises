import java.util.List;
import java.util.stream.Collectors;

class FindLengthOfStrings {
    public static List<Integer> getCourseNameCharacterCount(List<String> courses) {
        
        if(courses == null) {
            return List.of();
        }
        return courses.stream().map(String::length).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> courses = List.of("Learn AWS", "Learn JAVA", "Learn Python");
        System.out.println(getCourseNameCharacterCount(courses));
    }
}