import java.util.HashSet;

public class repeatedWordsInSentence {
    public static void main(String[] args) {
        String str = "i need coffee when i am in the office i dont like";
        String[] words = str.split("\\s+");
        HashSet<String> set1 = new HashSet<>();
        int count = 0;

        for(int i = 0; i< words.length; i++){
            for(int j = i+1; j< words.length; j++){
                if(words[i].equalsIgnoreCase(words[j])){
                    set1.add(words[i]);
                    count++;
                }

            }
        }
        System.out.println(count);
        System.out.println(set1);


    }
}
