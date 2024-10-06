public class swapWords {
    public static void main(String[] args) {
        String a = "My Name is Nithin";
        String[] b = a.split("\\s++");

        String commonStr = a.substring(3,10);

        System.out.println(b[3]+" "+commonStr+" "+b[0]);
    }

}
