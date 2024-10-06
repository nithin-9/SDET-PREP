import org.w3c.dom.ls.LSOutput;
//
//import java.util.*;
//
//public class sample {
//    public static void main(String[] args) {
//
//        ArrayList<String> strings = new ArrayList<String>();
//        strings.add("flower");
//        strings.add("flow");
//
//        StringBuilder sb = new StringBuilder();
//
//
//        for (int i = 0; i <= strings.size() - 1; i++) {
//            for (int j = 1; j <= strings.size() - 1; j++) {
//
//                char first = strings.get(i).charAt(i);
//                char second = strings.get(j).charAt(i);
//
//
//                if (first == second) {
//                    sb.append(first);
//                    System.out.println(sb.toString());
//
//                }
//            }
//        }
//
//    }
//}

public class sample {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        if (strs == null || strs.length == 0) {
            System.out.println("Longest Common Prefix: ");
            return;
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
//                System.out.println((strs[i].indexOf(prefix)));
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("Longest Common Prefix: ");
                    return;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}
