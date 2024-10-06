import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class sumOfIntegersArray {
    public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};

       int sum = 0;
       for(int i = 0; i< arr.length; i++){
//           int iteration = arr[i];
           sum = sum + arr[i];
       }

        System.out.println(sum);

       SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
       String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
