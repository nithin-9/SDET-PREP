import java.util.Arrays;
import java.util.Collections;

public class secondLargestNumber {
    public static void main(String[] args) {


        int[] arr = {1, 3, 40, 5, 21};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j=i+1; j < arr.length;j++) {

                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);
    }
}
