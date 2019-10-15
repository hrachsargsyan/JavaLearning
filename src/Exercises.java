import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercises {
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

    public static void ex$13() {
        Integer digit = n$n157();
        System.out.println(digit);
    }

    public static void ex$14() {
        Long aLong = n$n158();
        System.out.println(aLong);
    }

    public static void ex$15() {
        Integer integer = n$n160();
        System.out.println(integer);
    }

    public static void ex$16() {
        BigInteger integer1 = n$n166();
        System.out.println(integer1);
    }

    public static void ex$17() {

        Integer integer = n$n161();
        System.out.println(integer);
    }

    public static void ex$18() {

        Integer integer = n$n162();
        System.out.println(integer);
    }

    public static void ex$19() {

        Integer integer = n$n163();
        System.out.println(integer);
    }

    public static void ex$20() {
        Boolean aBoolean = n$n164();
        System.out.println(aBoolean);
    }

    public static void ex$21() {
        Integer integer = n$n165();
        System.out.println(integer);
    }

    public static void ex$22() {
        ArrayList<Integer> integerArrayList = n$n167();
        System.out.println(integerArrayList);
    }


    public static void ex$23() {
        int[] integers = sorting();
        System.out.println(Arrays.toString(integers));
    }

    public static void ex$24() {
        Long integers = fibonacci(5);
        System.out.println(integers);
    }





 /*   public static void ex$22() {

        System.out.println(integer);
    }*/


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
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
        if (input == 2)
            seqFibo[1] = 1;
        for (int a = 2; a < seqFibo.length; a++) {
            seqFibo[1] = 1;
            seqFibo[a] = seqFibo[a - 1] + seqFibo[a - 2];
        }
        System.out.println(Arrays.toString(seqFibo)); //test
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

    static int n$n157() {

        System.out.println("Տպել բոլոր այն եռանիշ թվերի գումարը , որորնք բազմապատիկ չեն 5-ին : \n");
        int a = 0;
        ArrayList<Integer> longArrayList = new ArrayList<>(); //test

        for (int b = 100; b < 1000; b++) {
            if (b % 5 != 0) {
                a += b;
                longArrayList.add(b); //test
            }
        }
        System.out.println(longArrayList); //test
        return a;
    }

    static long n$n158() {

        System.out.println("Տպել բոլոր այն եռանիշ թվերի արտադյալը , որորնք բազմապատիկ չեն 2-ին և 3-ին : \n");
        long a = 1;
        ArrayList<Long> longArrayList = new ArrayList<>(); //test

        for (int b = 100; b < 1000; b++) {
            if (b % 2 != 0 && b % 3 != 0) {

                a *= b;
                longArrayList.add((long) b); //test
            }
        }
        System.out.println(longArrayList); //test
        return a;
    }

    static int n$n160() {
        System.out.println("Տպել այն ամենափոքր եռանիշ թիվը , որը 16-ով բազմապատկելիս դառնում է բնական թվի քառակուսի");
        int a = 100;
        for (a = 100; a < 1000; a++) {
            int b = a * 16;
            if (b % Math.sqrt(b) == 0) {
                break;
            }
        }
        return a;
    }

    static int n$n161() {
        System.out.println("Տպել այն ամենափոքր քառանիշ թիվը , որը 26-ով բազմաատկելիս դառնում է բնական թվի քաղակուսի ");
        int a = 999;
        while (a++ < 10000 && (a * 26) % (Math.sqrt(a * 26)) != 0) {
            System.out.println(a + " " + "a * 26 : " + (a * 26) + " Math.sqrt(a * 26) : " + (Math.sqrt(a * 26)));

        }

//          System.out.println(a + " " + "a * 26 : " + (a * 26) + " Math.sqrt(a * 26) : " + (Math.sqrt(a * 26)));       //test
        return a;
    }

    static int n$n162() {
        System.out.println("Տպել այն ամենամեծ քառանիշ թիվը , որը 14-ով բազմաատկելիս դառնում է բնական թվի քառակուսի ");
        int a = 10000;
        while (--a > 999 && (a * 14) % (Math.sqrt(a * 14)) != 0) {
        }
        return a;
    }

    static int n$n163() {
        System.out.println("Տպել այն ամենափոքր եռանիշ թիվը , որի քառակուսի արմատը մեծ է տրված n բնական թվից:");
        Scanner scN = new Scanner(System.in);
        System.out.println("Խնդրու մեմ մուտքագրել Ձեր \"N\" բնական թիվը:");
        int n = scN.nextInt();
        int d = 99;
        for (; d++ < 1000; ) {
            System.out.println(d + " " + Math.sqrt(d)); //test
            if ((d % (Math.sqrt(d)) == 0) && (Math.sqrt(d) > n))
                break;
        }
        return d;
    }

    static boolean n$n164() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter your \"N\" digit: ");
        int input = scanner.nextInt();
        boolean bool = false;
        if (Math.IEEEremainder(input, Math.cbrt(input)) == 0)
            bool = true;
        return bool;
    }

    static int n$n165() {
        System.out.println("Y փոփոխականին վերագրել 0 , եթե N թիվը 4-րդ աստիճանի չէ , հակառակ դեպքում վերագրել 1 : ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please,enter your \"N\" digit: ");
        int input = scanner.nextInt();
        int y = 0;
        if (input % (Math.sqrt(Math.sqrt(input))) == 0)
            y = 1;
        return y;
    }

    static BigInteger n$n166() {
        System.out.println("Տպել բոլոր այն եռանիշ թվերի արտադյալը , որորնք 3-ի բաժանելիս կմնա 1 մնացորդ , իսկ 4-ի բաժանելիս՝՝ 2 մնացորդ  : \n");
        BigInteger c = BigInteger.valueOf(1);
        for (int b = 99; b++ < 1000; ) {
            if ((b % 3 == 1) && (b % 4 == 2)) {
                c = c.multiply(BigInteger.valueOf(b));
            }
        }
        return c;
    }

    static ArrayList<Integer> n$n167() {

        System.out.println("Տպել բոլոր այն եռանիշ թվերի արտադյալը , որորնք 3-ի բաժանելիս կմնա 1 մնացորդ , իսկ 4-ի բաժանելիս՝ 2 մնացորդ  : \n");
        int a = 100, b = -1, c = -1;
        ArrayList<Integer> arrayList = new ArrayList<>();      // for test
        ArrayList<Integer> arrayList1 = new ArrayList<>();      // for test
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        for (a = 100; a < 1000; a++) {
            if (a % 3 == 1) {
                b = a;
            } else {
                b = -1;
            }

            if (a % 4 == 2 && b != -1) {
                arrayList2.add(c * b);

            }
        }
        System.out.println(arrayList + "\n");       // for test
        System.out.println(arrayList1 + "\n");      // for test
        return arrayList2;
    }

    static int[] sorting() {
        int[] digits = {15, 10, 98, 74, 63, 47, 52, 45, 1, 9, 99};
        int b = 0;
//   for (int x: digits){
//
//   }
        do {
            for (int a = 0; a < digits.length - 1; a++) {
                if (digits[a + 1] < digits[a]) {
                    int buffer = digits[a];
                    digits[a] = digits[a + 1];
                    digits[a + 1] = buffer;
                    if (a > 1) a -= 2;
                }
            }
            b++;

        }
        while (b < 2);
        return digits;
    }

    static long fibonacci(long index) {
        if (index <= 1) return index;
        return fibonacci(index - 1) +
                fibonacci(index - 2);
    }


}
//  static int sum(int number) {
//      int sum = 0;
//      for(int i = 0; i<=number; i++)
//          sum+=i;
//      return sum;
//  }
//  static int sum_new(int number) {
//      if(number == 1) return 1;
//      return number+sum_new(--number);
//  }



