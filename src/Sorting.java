import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 8, 2, 6, 10, 3, 9, 8};
        //System.out.println(Arrays.toString(bubble_sort(arr)));
        System.out.println(Arrays.toString(insertion_sort(arr)));
    }

    // {1,8,2,6,10,3,9, 8};
    static int[] insertion_sort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int k = i;
            while (k > 0 && arr[k] < arr[k - 1]) {
                int temp = arr[k];
                arr[k] = arr[k - 1];
                arr[k - 1] = temp;
                k--;
            }
        }
        return arr;
    }

    static int[] bubble_sort(int[] arr) {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0, length = arr.length - 1; i < length - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }

    // {1,8,2,6,10,3,9, 8};
    static int[] selection_sort(int[] arr) {
        int min_index;
        for (int i = 0; i < arr.length; i++) {
            min_index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
        return arr;
    }
}