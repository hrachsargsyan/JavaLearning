import java.util.Arrays;

public class Square {

    static int[] spiral(int[][] arr) {
        /*
        0- right
        1- down
        2-left
        3-up
         */
        int up = 0;
        int left = 0;
        int right = arr[0].length - 1;
        int down = arr.length - 1;
        int[] new_arr = new int[arr.length * arr[0].length];
        int index = 0;
        while (up <= down && left <= right) {
            //right
            for (int i = left; i <= right; i++) {
                new_arr[index++] = arr[up][i];
            }
            up++;
            //down
            for (int i = up; i <= down; i++) {
                new_arr[index++] = arr[i][right];
            }
            right--;
            // left
            for (int i = right; i >= left; i--) {
                new_arr[index++] = arr[down][i];
            }
            down--;
            //up
            for (int i = down; i >= up; i--) {
                new_arr[index++] = arr[i][left];
            }
            left++;
        }
        return new_arr;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2},
                {5, 6},
                {9, 10},
                {13, 14}};
        int[] a = spiral(arr);
        System.out.println(Arrays.toString(a));
    }
}