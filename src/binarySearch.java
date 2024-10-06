import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class binarySearch {
    public static void main(String[] args) {

        int[] arr = {1,20,30,46,54,63,71};
        String b1 = Arrays.toString(arr);

        List<Integer> arrList = new ArrayList<>();

        for(int i: arr){
            arrList.add(i);
        }

        System.out.println(arrList);


        System.out.println(b1);


        int search = 20;
        int min = 0;
        int max = arr.length-1;
        int mid = 0;

        while(min<=max){
            mid = (min + max)/2;

            if(arr[mid]>search){
                max=mid-1;
            } else if(arr[mid]<search){
                min = mid+1;
            } else if(arr[mid]==search){
                System.out.println("search found at"+ mid);
                break;
            } else {
                System.out.println("search not found");
                break;
            }

        }




    }
}
