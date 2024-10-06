public class swap2Numbers {
    public static void main(String[] args) {
        int a = 3;
        int b = 6;

        // with 3rd variable

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);

        // without 3rd variable

        int c = 3;
        int d = 6;

        c = c + d; //9
        d = c - d; //3
        c = c - d; //6

        System.out.println("c is "+c);
        System.out.println("d is "+d);

    }
}
