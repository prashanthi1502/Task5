import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyString{
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        nonEmptyStrings.forEach(System.out::println);
    }
}

