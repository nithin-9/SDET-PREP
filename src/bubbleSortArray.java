import java.util.Arrays;
import java.util.List;

public class bubbleSortArray {
    public static void main(String[] args) {



        List<String> words = Arrays.asList("ball", "apple", "applee", "bala");
//        List<Integer> words = Arrays.asList(4,1,4,66,3,7);

        for(int i = 0; i<words.size() - 1; i++){
            for(int j = 0; j< words.size() - 1 - i; j++) {

                if(words.get(j).compareTo(words.get(j+1))>0){
                    String temp = words.get(j);
                    words.set(j, words.get(j+1));
                    words.set(j+1, temp);
                }
            }
        }
        System.out.println(words);
    }
}
