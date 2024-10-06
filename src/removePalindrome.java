import java.util.ArrayList;
import java.util.List;

public class removePalindrome {
    public static void main(String[] args) {
        String str = "Nitin love racecar";
        String[] strArr = str.split(" ");

        List<String> newList = new ArrayList<>();;
        List<String> palindrome = new ArrayList<>();;

        for(int i = 0; i < strArr.length; i++){
            String sb = strArr[i];
            StringBuilder reversedStr = new StringBuilder(sb).reverse();
            System.out.println(reversedStr);

            if(!sb.equalsIgnoreCase(reversedStr.toString())){
                newList.add(strArr[i]);
            }else if(sb.equalsIgnoreCase(reversedStr.toString())){
                palindrome.add(strArr[i]);
            }

        }
        System.out.println(newList);
        System.out.println(palindrome);

    }
}
