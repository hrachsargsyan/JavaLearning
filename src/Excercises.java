import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Excercises {
    public static void ex$1() {
        System.out.println("Exercise 1");
        ArrayList<Integer> arrayList = devide();
        System.out.println(arrayList);
        ArrayList<Integer> arrayList1 = devide1();
        System.out.println(arrayList1);
        ArrayList<Integer> arrayList2 = devide2();
        System.out.println(arrayList2);
    }

    public static void ex$2() {

        System.out.println("Exercise2");
        Integer integer = converter();
        System.out.println("Your digit is: " + integer);

    }

    public static void ex$3() {
        String string = time();
        System.out.println(string);

    }

    public static void ex$4() {

        String string = cap();
        System.out.println(string);

    }

    public static void ex$5() {
        String string = longest();
        System.out.println(string);
    }

    public static void ex$6() {
        Integer integer = fibo();
        System.out.println(integer);


    }

    public static void ex$7() {
        Integer integer = n$n();
        System.out.println(integer);
    }

    public static void ex$8() {
        Long integer = n$n1();
        System.out.println(integer);
    }

    public static void ex$9() {
        Integer integer = n$n3();
        System.out.println(integer);
    }

    public static void ex$10() {

        Integer integer = n$n4();
        System.out.println(integer);
    }

    public static void ex$11() {
        Integer integer = n$n5();
        System.out.println(integer);
    }

    public static void ex$12() {
        Long integer = n$n6();
        System.out.println(integer);
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    static ArrayList<Integer> devide() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int d = 0; d < 101; d++) {
            if (d % 3 == 0)
                arr.add(d);
        }
        return arr;
    }

    static ArrayList<Integer> devide1() {
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int e = 0; e < 101; e++) {
            if (e % 5 == 0)
                arr2.add(e);
        }
        return arr2;
    }

    static ArrayList<Integer> devide2() {
        ArrayList<Integer> arr3 = new ArrayList<>();
        for (int f = 0; f < 101; f++) {
            if (f % 5 == 0 && f % 3 == 0)
                arr3.add(f);
        }
        return arr3;
    }

    static int converter() {
        System.out.println("Please , input 25");
        Scanner conv = new Scanner(System.in);
        String input = conv.next();
        int digit = Integer.parseInt(input);
        return digit;
    }


    static String time() {
        int ex = 86399;
        System.out.println("Seconds: " + ex);
        int hours = ex / 60 / 60;
        int minutes = (ex - (hours * 60 * 60)) / 60;
        int seconds = ex - (hours * 60 * 60) - (minutes * 60);
        return (hours + ":" + minutes + ":" + seconds);

    }

    static String cap() {
        String inputText = "the quick brown fox jumps over the lazy dog.";
        // System.out.println(inputText);
        char[] upper = inputText.toCharArray();
        //     System.out.println(upper);
        for (int x = 0; x < upper.length; x++) {
            upper[0] = Character.toUpperCase(upper[0]);
            if (Character.isSpaceChar(upper[x]))
                upper[x + 1] = Character.toUpperCase(upper[x + 1]);
        }
        return new String(upper);
    }

    static String longest() {

        String[] str = {"cat", "flag", "green", "country", "w3resource"};

        int a = 0;
        int b = 0;

        for (a = 0; a < str.length; a++) {
            if (str[a].length() > b)
                b = a;
        }
        return new String(str[b]);
    }

    static int fibo() {
        System.out.println("Please , enter your FiboDigit");
        Scanner fiboDigit = new Scanner(System.in);
        int input = fiboDigit.nextInt();
        int[] seqFibo = new int[input];
        for (int a = 2; a < seqFibo.length; a++) {
            seqFibo[1] = 1;
            seqFibo[a] = seqFibo[a - 1] + seqFibo[a - 2];
        }
        return seqFibo[input - 1];
    }

    static int n$n() {
        System.out.println("Տպել բոլոր բնական թվերի գումարը , որոնց վրա  g բաժանվում է առանց մնացորդի : \n");
        int g = 90;
        int gumar = 0;
        for (int a = 1; a <= g; a++) {
            if (g % a == 0) {
                gumar += a;
            }
        }
        return gumar;
    }

    static long n$n1() {
        System.out.println("Տպել բոլոր բնական թվերի արտադրյալը , որոնց վրա g բաժանվում է առանց մնացորդի :\n");
        int g = 90;
        long artadryal = 1;
        for (int a = 1; a <= g; a++) {
            if (g % a == 0) {
                artadryal = artadryal * a;
            }
        }
        return artadryal;
    }

    static int n$n3() {
        System.out.println("Տպել բոլոր բնական թվերի գումարը , որոնց վրա  g բաժանելիս կմնա 2 մնացորդ: \n");
        ArrayList<Integer> digitsArray = new ArrayList<>(); // for test
        int g = 90;
        int gumar = 0;
        for (int a = 1; a <= g; a++) {
            if (g - (a * (g / a)) == 2) {
                gumar += a;
                digitsArray.add(a); // for test
            }
        }
        System.out.println(digitsArray); // for test
        return gumar;
    }


    static int n$n4() {
        System.out.println("Տպել բոլոր բնական թվերի արտադրյալը , որոնց վրա  g բաժանելիս կմնա 3 մնացորդ: \n");
        ArrayList<Integer> digitsArray = new ArrayList<>(); // for test
        int g = 90;
        int artadryal = 1;
        for (int a = 1; a <= g; a++) {
            if (g - (a * (g / a)) == 3) {
                artadryal *= a;
                digitsArray.add(a); // for test
            }
        }
        System.out.println(digitsArray); // for test
        return artadryal;
    }

    static int n$n5() {
        System.out.println("Տպել բոլոր երկնիշ թվերի գումարը , որոնք բազմապատիկ են 3-ին: \n");
        ArrayList<Integer> digitsArray = new ArrayList<>(); // for test
        int a;
        int b = 0;
        for (a = 10; a < 100; a++) {
            if (a % 3 == 0) {
                b += a;
                digitsArray.add(a); // for test
            }
        }
        System.out.println(digitsArray); // for test
        return b;
    }

    static long n$n6() {
        System.out.println("Տպել բոլոր երկնիշ թվերի արտադրյալը  , որոնք բազմապատիկ են 3-ին և 5-ին: \n");
        ArrayList<Integer> arrayList = new ArrayList<>(); //test
        int a;
        long b = 1;
        for (a = 10; a < 100; a++) {
            if (a % 3 == 0 && a % 5 == 0) {
                b *= a;
                arrayList.add(a); //test
            }
        }
        System.out.println(arrayList); //test
        return b;
    }



}







