package OOPS;

public class encapsulationExample {
    private int a;
    public void firstMethodSet(int a){
        this.a = a;
    }

    public int getMethod(){
        return a;
    }
}
class secondClass{
    public static void main(String[] args) {
        encapsulationExample test = new encapsulationExample();
        test.firstMethodSet(1000);
        System.out.println(test.getMethod());

    }
}
