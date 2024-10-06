import java.util.Arrays;
import java.util.List;

public class namesStartingWithV {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("virat","rohith","dhawan","virendra","vineeth");
        for(int i = 0; i<al.size();i++){
            if(al.get(i).startsWith("v")){
                System.out.println(al.get(i));
            }
        }
    }
}
