public class palindromeOrNot {
    public static void main(String[] args) {
        String input = "ma la y al a m";
        StringBuilder sb = new StringBuilder(input.replaceAll("\\s+",""));

//        if(sb.reverse().toString().equals(input)){
//            System.out.println("input is palindrome");
//        }else {
//            System.out.println("not a palindrome");
//        }

        // with for loop
        StringBuilder sb1 = new StringBuilder();

        for (int i = sb.length()-1; i >=0 ; i--) {
            sb1.append(sb.charAt(i));
        }
        System.out.println(sb1);

        if(sb1.toString().equals(sb.toString())){
            System.out.println("inout is palindrome");
        } else{
            System.out.println("inout is not palindorme");
        }
    }
}
