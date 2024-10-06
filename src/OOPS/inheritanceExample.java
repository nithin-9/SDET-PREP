package OOPS;

public class inheritanceExample { // parent class
    void parentMethod(){
        System.out.println("parent method execution");
    }

    void parentTwo(int a, int b){
        int c = a+b;
        System.out.println(c);
    }
}
class childClass extends inheritanceExample{
    public static void main(String[] args) {
        childClass c = new childClass();
        c.parentMethod();

        c.parentTwo(2,4);
    }
}

