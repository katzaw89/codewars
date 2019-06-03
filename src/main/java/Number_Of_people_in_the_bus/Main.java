package Number_Of_people_in_the_bus;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {



    }
    Metro metro = new Metro();
    public void test1() {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        assertEquals(5, metro.countPassengers(list));
    }

    private void assertEquals(int i, int countPassengers) {


    }

}
