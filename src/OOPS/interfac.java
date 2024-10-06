package OOPS;

public class interfac {
    interface i1{
        void show();
    }
    interface  i2{
        void display();
    }

     class interfac2 implements i1, i2{
        @Override
        public void show() {
            System.out.println("Show method from i1");
        }

        @Override
        public void display() {
            System.out.println("Display method from i2");
        }

    }

    public static void main(String[] args) {
        interfac outer = new interfac();

        interfac2 t = outer.new interfac2();
        t.show();
        t.display();
    }

}
