import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class check2ListsAreEqual {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("ball", "apple", "dog", "cat");
        List<String> words2 = Arrays.asList("dog", "apple", "ball", "cat");

        System.out.println(words.equals(words2));

        Collections.sort(words);
        Collections.sort(words2);


        boolean isEqual = true;
        for(int i = 0; i<words.size(); i++){
            if (!Objects.equals(words.get(i), words2.get(i))) {
                isEqual = false;
                break;
            }
        }

        if(isEqual){
            System.out.println("list is same");
        } else{
            System.out.println("list is not same");
        }




    }
}
