import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWords {
    public static void main(String[] args) {

        String name = "My Name is Nithin";
        String[] split = name.split("\\s+");

        List<String> finalName = Arrays.asList(split);
        Collections.reverse(finalName);

        System.out.println(String.join(" ", finalName));
    }
}
