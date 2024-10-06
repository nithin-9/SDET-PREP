import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class vowels {
    public static void main(String[] args) {
        String input = "VEEva SysteMS";
        Pattern p = Pattern.compile("[aeiouAEIOU]");
        Pattern p2 = Pattern.compile("[^aeiouAEIOU ]");
        Matcher m = p.matcher(input);
        Matcher m2 = p2.matcher(input);

        int vowelCount = 0;
        int consonantCount = 0;

        StringBuilder onlyVowels = new StringBuilder();
        StringBuilder notVowels = new StringBuilder();

        while(m.find()){
            vowelCount++;
            String vowel = m.group();
            onlyVowels.append(vowel);
        }

        while(m2.find()){
            consonantCount++;
            String notVowel = m2.group();
            notVowels.append(notVowel);
        }
        System.out.println(onlyVowels);
        System.out.println(notVowels);

        System.out.println(vowelCount);
        System.out.println(consonantCount);

    }
}
