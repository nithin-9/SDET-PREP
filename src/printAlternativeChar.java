public class printAlternativeChar {
    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "ABCD";
        String s = "";
        StringBuilder sb1 = new StringBuilder();

        for(int i = 0; i<str1.length();i++){
            sb1.append(str1.charAt(i));
            sb1.append(str2.charAt(i));

            s= s+str1.charAt(i);
            s= s+str2.charAt(i);
        }
        System.out.println(s); // using strings
        System.out.println(sb1); // using string builder
    }
}
