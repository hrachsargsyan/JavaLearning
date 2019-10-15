import java.util.Arrays;

public class Algorithms<simple> {
    public static void main(String[] args) {
        int[] simple = {10, 9, 3, 8, 11, 7, 1, 5, 4, 6};
// int[] ints = bubbleSorting(simple);
// System.out.println(Arrays.toString(bubbleSorting(ints)));
// int[] ints1 = selectionSorting(simple);
// System.out.println(Arrays.toString(ints1));

        int[] ints2 = insertionSort(simple);
        System.out.println(Arrays.toString(ints2));
    }


    static int[] bubbleSorting(int[] simple) {

        for (int b = simple.length; b >= 0; b--) {
            for (int a = 0; a < b - 1; a++) {
                int buff = 0;
                if (simple[a] > simple[a + 1]) {
                    buff = simple[a];
                    simple[a] = simple[a + 1];
                    simple[a + 1] = buff;
                }
            }
        }
        return simple;
    }


    static int[] selectionSorting(int[] simple) {
        int min;
        for (int a = 0; a < simple.length; a++) {
            min = a;
            for (int b = a + 1; b < simple.length; b++) {
                if (simple[b] < simple[a]) {
                    int buff = simple[a];
                    simple[a] = simple[b];
                    simple[b] = buff;
                }
            }
        }
        return simple;
    }

    static int compare(int a, int b) {
        if (a > b)
            return b;
        else return a;

    }

    static int[] insertionSort(int[] simple) {
        int buff = 0;


        for (int sorted = 0; sorted < simple.length - 1; sorted++) {
            if ((simple[sorted] > simple[sorted + 1]) && sorted > 1) {
                buff = simple[sorted];
                simple[sorted] = simple[sorted + 1];
                simple[sorted + 1] = buff;
            }
        }

        return simple;
    }
}









