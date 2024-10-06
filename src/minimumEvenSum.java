import java.util.List;
import java.util.Arrays;

public class minimumEvenSum {

    public static void main(String[] args) {
        // Example input list
        List<Integer> val = Arrays.asList(2, 3, 6, 5, 10, 1, -1);

        // Initialize variables
        long totalSum = 0;
        long minPositiveOdd = Long.MAX_VALUE;

        // Calculate totalSum and find the minimum positive odd value
        for (int i = 0; i < val.size(); i++) {
            int value = val.get(i);
            totalSum += value;
            if (Math.abs(value) % 2 != 0) {
                minPositiveOdd = Math.min(minPositiveOdd, Math.abs((long) value));
//                Math.min()
            }
        }

        // Determine if totalSum is even
        if (totalSum % 2 == 0) {
            System.out.println("Maximum Even Sum: " + totalSum);
        } else {
            System.out.println("Maximum Even Sum: " + (totalSum - minPositiveOdd));
        }
    }
}
