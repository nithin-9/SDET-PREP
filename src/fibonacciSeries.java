public class fibonacciSeries {
    public static void main(String[] args){
        int a = 0;
        int b = 1;

        System.out.print(a+", "+b+", ");

        for(int i = 0; i<9; i++){
            int next = a+b;

            System.out.print(next+", ");     //0,1,1,2,3,5,8,13

            a = b;
            b = next;
        }

    }
}