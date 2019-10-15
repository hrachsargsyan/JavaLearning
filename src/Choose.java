import java.util.Scanner;

public class Choose {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b = 1;
        while (b == 1) {
            b = 0;
            System.out.println("Enter your choice:");
            a = sc.nextInt();
            while (a > 5 || a < 1) {
                System.out.println("Your choice must be in range 1 - 5 ");
                a = sc.nextInt();

                if (a < 4 && a > 0)
                    System.out.println("Your choice is 1");
                else if (a > 3 && a < 6)
                    System.out.println("Your choice is 2");
                System.out.println("Choose again ?" + "\n" + "Yes - 1\nNo - 0");
                b = sc.nextInt();
                if (b == 0)
                    System.out.println("Exit");
                else if (b == 1)
                    b = 1;
                else
                    System.out.println("Enter 1 or 0 ");

                b = sc.nextInt();
            }
        }
    }
}






