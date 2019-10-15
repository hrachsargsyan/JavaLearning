import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main$2 {

    public static void main(String[] args) {

        // выведите на экран таблицу умножения

        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your number :");

        int f = 1;
        int g = sc.nextInt();
        ;

        while (f < 10) {
            System.out.println(g + " " + "X" + " " + f + " = " + (g * f));
            f++;
        }
        f = 1;
        g++;


        System.out.println("Write a programm to display JAVA ");

        // 25

        System.out.println("Write a Java program to swap two small int variables");
        int a = 5;
        int b = 7;

        a = a + b; // a= 12
        b = a - b; // b= 5
        a = a - b; // a = 7

        System.out.println("a = " + a + " " + "b = " + b + "\n");


        System.out.println("Java program to convert a demical number to binary number ");
        int c = 16; // Demical
        int d = 2;

        int mass[] = new int[5];
        int l = mass.length - 1;
        while (c > 0) {
            mass[l--] = c % d;
            c /= d;
        }
        System.out.println(Arrays.toString(mass));


        System.out.println("Java program to convert a hexademical number to binary number ");

        int[] mass_new = new int[5];
        int ff = 16;
        int gg = 47;
        int k = mass_new.length - 1;

        while (gg > 0) {
            mass_new[k] = gg % ff; // reminder = index
            gg /= ff;
            k--;
        }
        // 'A' 'B' 'C'
        System.out.println('F' - 'A');
        for (int i = 0; i < mass_new.length; i++) {
            if (mass_new[i] > 9) {
                char ch = (char) ('A' + mass_new[i] - 10);
                System.out.print(ch + " ");
            } else
                System.out.print(mass_new[i] + " ");

        }

        System.out.println("Write a program to count the letters , spaces , numbers , and other characters of an input string ");
        System.out.println("The String is : Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25,33");


    }
}
