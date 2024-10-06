package OOPS;

public class Polymorphism_M_OR {

    void method1(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}

class childrenClass extends Polymorphism_M_OR{
    void method1(int a, int b){
        int c = a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Polymorphism_M_OR one = new Polymorphism_M_OR();
        one.method1(5,10);

        childrenClass two =new childrenClass();
        two.method1(10,20);
    }

}
