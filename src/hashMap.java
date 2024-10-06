import com.sun.jdi.Value;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Age",22);
        map.put("Cost",100);
        Integer a = map.get("Age");
        System.out.println(a);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key);
            System.out.println(value);
        }
    }
}
