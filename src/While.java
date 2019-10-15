import java.util.Arrays;

public class While {


    public static void main(String[] args) {


        System.out.println("Silence is golden");

        //

        System.out.println("Choreqshabti" + "\n" + "Septmeber" + "\n" + "Hrach");

        //
        String mass[] = new String[]{"0", "00", "000", "0000", "00000"};

        for (int i = 0; i < 5; i++) {
            System.out.println(mass[i]);
        }

        System.out.println("\n");
        //


        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < 9; b++) {
                System.out.print("A");
            }
            System.out.print("\n");
        }


        System.out.print("\n");


        System.out.println("1+2-4=" + (1 + 2 - 4));


        System.out.print("\n");

// *****************************************************************************************************************************************//

        System.out.println("Заполнить массив нулями, кроме первого и последнего элементов, которые должны быть равны единице." + "\n");


        int i = 0;
        int w[] = new int[16];

        for (i = 0; i < 6; i++) {
            if (i == 0 | i == 5) {
                w[i] = 1;
            } else w[i] = 0;
            System.out.println(w[i]);
        }


        System.out.print("\n");


        System.out.println("Заполнить массив нулями и единицами, при этом данные значения чередуются, начиная с нуля." + "\n");


        int x[] = new int[16];

        for (int y = 0; y < x.length; y += 2) {
            if (y % 2 == 0) {
                x[y] = 0;
            } else x[y] = 1;
            x[y] = 0;
            x[y + 1] = 1;

            System.out.println(x[y]);
            System.out.println(x[y + 1]);

        }

        int length = x.length - 1;
        for (int y = 0; y < length; y = y + 2) {
            x[y] = 0;
            x[y + 1] = 1;
            System.out.print(x[y] + "" + x[y + 1] + "");
        }
        if (x.length % 2 != 0) {
            x[length] = 0;
            System.out.print(x[length]);
        }


        System.out.print("\n");


        System.out.println("Заполнить массив последовательными нечетными числами, начиная с единицы." + "\n");

        for (int y = 0; y < x.length; y++) {
            if (y % 2 != 0) {
                x[y] = y;
                System.out.println(x[y]);
            }
        }

        System.out.print("\n");


        System.out.println("Сформировать массив из элементов арифметической прогрессии с заданным первым элементом x и разностью d." + "\n");


        int f[] = new int[16];


        f[0] = 8;
        for (int z = 1; z < f.length; z++) {
            f[z] = f[z - 1] + 5;
        }
        System.out.println(Arrays.toString(f));


        System.out.print("\n");


        System.out.println("Сформировать возрастающий массив из четных чисел." + "\n");


        for (int y = 0; y < x.length; y++) {
            if (y % 2 == 0 && y != 0) {
                x[y] = y;
                System.out.println(x[y]);
            }
        }


        System.out.println();


        System.out.println("Сформировать убывающий массив из чисел, которые делятся на 3." + "\n");

        int j[] = new int[10];
        int n = 500;


        for (int k = 0; k < j.length; k++) {
            if (n < 600 && n % 3 == 0) {
                j[k] = n;
                System.out.println(j[k]);
            } else if (k != 0) {
                k = k - 1;
            } else k = -1;
            n = n - 4;
        }


        System.out.println();




        System.out.println("Создать массив из n первых чисел Фибоначчи." + "\n");


        int fibbo[] = new int[24];
        for (int b = 0; b < fibbo.length; b++) {
            if (b != 0 && b != 1)
                fibbo[b] = (fibbo[b] + fibbo[b - 1] + fibbo[b - 2]);
            else if (b == 1)
                fibbo[b] = 1;
            else if (b == 0)
                fibbo[b] = 0;
            System.out.println(fibbo[b]);
        }

        System.out.println();



        System.out.println("Создать массив, каждый элемент которого равен квадрату своего номера." + "\n");


        int qa[] = new int[90];

        for (int q = 0; q < qa.length; q++) {
            qa[q] = (int) Math.pow(q, 2);
            System.out.println(qa[q]);
        }



        System.out.println();


        System.out.println("Создать массив, на четных местах в котором стоят единицы, а на нечетных местах - числа, равные остатку от деления своего номера на 5. ???????????????????????????????????" + "\n");

        int p[] = new int[50];
        for (int z = 0; z < p.length; z++) {
            if (z % 2 == 0) {
                p[z] = 1;
            } else if (z < 5) {
                p[z] = 0;
            } else p[z] = z % 5;
            System.out.println(p[z]);
        }


        System.out.println();


        System.out.println("Создать массив, который одинаково читается как слева направо, так и справа налево." + "\n");

        int s[] = new int[7];

        s[0] = 12;
        for (int sI = 0; sI < s.length; sI++) {
            if (sI < 4 && sI != 0) {
                s[sI] = s[sI - 1] + 11;
            } else if (sI > 3) {
                s[sI] = s[sI - 1] - 11;
            }

            System.out.println(s[sI]);
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        /*
         *
         **
         ***
         ****
         *****
         */

        for (int ii = 4; ii >= 0; ii--) {
            for (int jj = ii + 1; jj < 6; jj++) {
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


/*        int massive[] = new int[6] ;
        int pop = 1 ;
        for (int a = 0 ; a<massive.length; a++){
            massive[a] = pop ;
            System.out.println(massive[a]);
            pop = pop +2 ;

        } */


        int massive[] = new int[6];
        for (int a = 0, pop = 1; a < massive.length; a++, pop += 2) {
            massive[a] = pop;
            System.out.print(massive[a] + " ");
        }

        System.out.println(Arrays.toString(massive));

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


//__________________________________________________________________________________________________________________//


        System.out.println(" Создать массив, состоящий из троек подряд идущих одинаковых элементов. " + "\n");


        int nine[] = new int[9];
        for (int xx = 0, xy = 1; xx < nine.length; xx = xx + 3, xy = xy + 10) {
            nine[xx] = xy;
            nine[xx + 1] = xy;
            nine[xx + 2] = xy;
        }
        System.out.println(Arrays.toString(nine));
    }
}





