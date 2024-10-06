public class vowelToConsonant {
     public static void main(String[] args) {
            String password = "Nithin"; // Example password
            int vowelCount = 0;
            int consonantCount = 0;

            for (char c : password.toCharArray()) {
                if ("aeiou".indexOf(c) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            int diff = Math.abs(vowelCount - consonantCount);
            int result = diff / 2;

            System.out.println(result); // Output the result
        }
}
