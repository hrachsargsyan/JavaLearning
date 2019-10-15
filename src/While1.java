public class While1 {

    public static void main(String[] args) {

        for (int a = 0; a < 5; a++) {
            for (int b = 0; b < 10; b++) {
                System.out.print("$");
            }

            System.out.println(" ");
        }
        int c = 0;
        while (c < 10) {
            System.out.println(c);
            c++;
        }
        int d = 0;
        int e = 0;
        while (d < 10) {
            while (e < 10) {
                System.out.print("$");
                e++;

            }
            e = 0;
            System.out.println(" ");
            d++;
        }

        System.out.println("выведите на экран таблицу умножения");

        int f = 1;
        int g = 1;
        while (g < 10) {
            while (f < 10) {
                System.out.println(g + " " + "X" + " " + f + " = " + (g * f));
                f++;
            }
            f = 1;
            g++;
            System.out.println();
        }


        System.out.println("найти сумму чисел от 1 до 100");
        int sum = 0;
        int i = 1;
        while (i < 101) {
            sum = sum + i;
            ++i;
        }
        System.out.println(sum);


        System.out.println("Дан массив с элементами 2, 5, 9, 15, 0, 4. С помощью цикла for и оператора if выведите на экран столбец тех элементов массива, которые больше 3-х, но меньше 10.");
        int mass[] = {2, 5, 9, 15, 0, 4};
        for (int k = 0; k < 6; k++) {
            if (mass[k] < 10 && mass[k] > 3) {
                System.out.println("Mass" + k + ":" + mass[k]);
            }
        }
        System.out.println();


        System.out.println("Дано число n=1000. Делите его на 2 столько раз, пока результат деления не станет меньше 50. Какое число получится? Посчитайте количество итераций, необходимых для этого (итерация - это проход цикла), и запишите его в переменную num.");

        int n = 1000;

        int num = 0;


        while (n > 50) {
            n = n / 2;
            num++;
        }
        System.out.println("число: " + n);
        System.out.println("количество итераций:" + num);



    }
}






