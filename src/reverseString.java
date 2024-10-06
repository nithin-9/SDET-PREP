public class reverseString {
    public static void main(String[] args){
        String str = "Captain Jack Sparrow";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(str.length()-1));
        String rev = "";
        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);

        }
        System.out.println(rev);

    }
}
