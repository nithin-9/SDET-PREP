import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streams {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("nithin1", "virat1", "roh5ith");

        // Filter names that start with 'r' and collect them into a new list
        List<String> filteredData = al.stream()
                .filter(name -> name.startsWith("r"))
//                .filter(name -> name.matches("(?=.*[a-zA-Z])(?=.*\\d).+"))
                .collect(Collectors.toList());

        System.out.println(filteredData);
    }
}