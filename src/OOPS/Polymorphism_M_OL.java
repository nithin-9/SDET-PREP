package OOPS;

public class Polymorphism_M_OL {
    void sumOfIntegers(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
    void sumOfIntegers(int a, int b,int c){
        int d = a+b+c;
        System.out.println(d);
    }

    public static void main(String[] args) {
        Polymorphism_M_OL test = new Polymorphism_M_OL();
        test.sumOfIntegers(1,2,3);
    }
}
