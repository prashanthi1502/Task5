import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGiftStudents {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Alice", "Bob", "Anna", "Tom", "Andrew", "Chris", "Alex", "Steve", "Amanda", "Brian");

        List<String> specialGiftStudents = students.stream()
                .filter(name -> name.startsWith("A")).collect(Collectors.toList());
        specialGiftStudents.forEach(System.out::println);
    }
}