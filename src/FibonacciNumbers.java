public class FibonacciNumbers {

    public static void main(String... args) {
        int[] arr = new int[7];
        fibonacci(6, arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int fibonacci(int index, int[] arr) {
        if (index <= 1) {
            arr[index] = index;
            return index;
        }
        int result = fibonacci(index - 1, arr) + fibonacci(index - 2, arr);
        arr[index] = result;
        return result;
    }
}
