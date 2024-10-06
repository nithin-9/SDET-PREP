import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class reverseWords2 {
    public static void main(String[] args) {
        // reverse words from sentence
        String str = "Hello World i am hero";
        String[] words = str.split("\\s+");

        List<String> reverse = Arrays.asList(words);
        Collections.reverse(reverse);

        System.out.println(reverse);

        // reverse letters from sentence
        String rev = "";
        StringBuilder s12 = new StringBuilder();


        for(int i = str.length()-1; i>=0; i--){
//            rev = rev + str.charAt(i);  //concat
            s12.append(str.charAt(i));    //sb
        }
        System.out.println(s12);

        // reverse letters from words

        StringBuilder s1 = new StringBuilder();
        String[] wordsList = str.split("\\s+");

        for(int i = 0; i< wordsList.length; i++){
            String s = wordsList[i];
            StringBuilder s2 = new StringBuilder();

            for (int j = s.length()-1; j >=0 ; j--) {
                s2.append(s.charAt(j));
            }

            s1.append(s2).append(" ");
        }
        System.out.println(s1);






    }
}
