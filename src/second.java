import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class second {
    public static void main(String[] args) {
//        List<String> names = Arrays.asList("ball","cat","apple");
//
//        for(int i = 0; i<names.size()-1; i++){
//            for(int j = 0; j<names.size()-1-i;j++) {
//                if (names.get(j).compareTo(names.get(j+1))>0){
//                    String temp = names.get(j);
//                    names.set(j, names.get(j+1));
//                    names.set(j+1, temp);
//                }
//            }
//        }
//
//        System.out.println(names);

        String s = "Chocolate";
        int n = 4;

        StringBuilder sb = new StringBuilder();

        for(int i = n; i>=0; i--){
            String b  = s.substring(0,i);
            sb.append(b);
        }

        System.out.println(sb);
    }
}
