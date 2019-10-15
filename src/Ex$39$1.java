import java.util.Arrays;
import java.util.Scanner;

public class Ex$39$1 {

    public static void main(String[] args) {
        Scanner digits = new Scanner(System.in);
        digits.nextInt();

  /*      int a = 10, b = 50, c = 40, d = 5;

        System.out.println("Please Enter 4 digits");

        a = digits.nextInt();
        System.out.println("First Digit :" + a + ", Please enter next digit .");
        b = digits.nextInt();
        System.out.println("First Second :" + a + ", Please enter next digit .");
        c = digits.nextInt();
        System.out.println("First Digit :" + a + ", Please enter the last digit .");
        d = digits.nextInt(); */


        int massive[] = {10, 20, 30, 40};
        int buffer;
        boolean sorted = false;

        while (!sorted) {
            sorted = true;
            for (int count = 0; count < massive.length - 1; count++) {
                if (massive[count] < massive[count + 1]) {
                    sorted = false;
                    buffer = massive[count];
                    massive[count] = massive[count + 1];
                    massive[count + 1] = buffer;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
}
