package Highest_and_Lowest;


import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        System.out.println(HighAndLow("1 2 3 4 5"));
        System.out.println(HighAndLow("1 2 -3 4 5"));
        System.out.println(HighAndLow("1 9 3 4 -5"));


    }


    public static String HighAndLow(String numbers) {

        String[] result = numbers.split(" ");
        int change[] = new int[result.length];
        for (int i = 0; i < result.length; i++) {

            change[i] = parseInt(result[i]);
        }
        int max = change[0];
        int min = change[0];
        for (int i = 0; i < change.length; i++) {
            if (change[i] > max) {
                max = change[i];
            }
            if (change[i] < min) {
                min = change[i];
            }

        }
        return max + " " + min;


}


}

