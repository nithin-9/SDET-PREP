public class substring {
    public static void main(String[] args) {
        String str1 = "nit";
        String str2 = "nithin";

        if(str1.length()>str2.length()) {
            if (str1.contains(str2)) {
                System.out.println("true");
            }
        }else{
            if (str2.contains(str1)) {
            System.out.println("true");
        }

        }
    }
}
