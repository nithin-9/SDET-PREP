package OOPS;

public class abstractionExample {
    public static void main(String[] args) {

        abstract class abstractClass {
            abstract void abstractMethod(int a, int b);
        }

        class childClassForAbstraction extends abstractClass {
            @Override
            void abstractMethod(int a, int b) {
                int c = a + b;
                System.out.println(c);
            }
        }

        childClassForAbstraction test = new childClassForAbstraction();
        test.abstractMethod(1,2);

    }
}
