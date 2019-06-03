package Beginner_Series_3;


public class Main {
    public static void main(String[] args) {
        int s;
//        getSum(1, 0);
//        getSum(1, 2);
//        getSum(0, 1);
//        getSum(1, 1);
//        getSum(-1, 0);
//        getSum(-1, 2);
    }

    public int getSum(int a, int b) {
        int suma = 0;


        if (a == b) {
            return a;
        } else {
            if (a > b) {
                int c = b;
                b = a;
                a = c;
            }
            for (int i = a; i <= b; i++) {
                suma += i;
            }
        }
        return suma;
    }

}