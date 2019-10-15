public class Ex_31_80 {


    public static void main(String[] args) {
        System.out.println("Տրված են իրաիրից տարբեր a , b , c, d թվերը : Կազմել ծրագիր , որը  ");

        System.out.println();

        int a = 50, b = 66, c = 77, d = 89;
        boolean b1 = false;

        System.out.println("1. կարտածի տրված թվերից մեծագույնը");
        System.out.println(Math.max(Math.max((Math.max(a, b)), c), d));

        a = 50;
        b = 66;
        c = 77;
        d = 89;

        System.out.println("2. կարտածի տրված թվերից փոքրագույնը");
        System.out.println(Math.min(Math.min((Math.min(a, b)), c), d));

        a = 50;
        b = 66;
        c = 77;
        d = 89;

        System.out.println("3. կարտածեն true , եթե թվերից մեկը = 1 այլապես՝ false , ");
        b1 = (a == 1 | b == 1 | c == 1 | d == 1);
        System.out.println(b1);

        a = 50;
        b = 66;
        c = 77;
        d = 89;

        System.out.println("4. եթե տրված թվերից 2-ի գումարը հավասար է մյուս 2-ի գումարին , կարտածի true .այլապես՝ false");
        b1 = ((a + b) == (c + d) | (a + c) == (b + d) | (a + d) == (b + c));
        System.out.println(b1);

        a = 50;
        b = 66;
        c = 77;
        d = 89;

        System.out.println("5. եթե տրված թվերից 1-ի գումարը հավասար է մյուս 3-ի գումարին , կարտածի true .այլապես՝ false");
        b1 = (a == (b + c + d) | b == (a + c + d) | c == (a + b + d) | d == (a + c + b));
        System.out.println(b1);

        a = 50;
        b = 66;
        c = 77;
        d = 89;

        System.out.println("6. եթե տրված թվերից գոնե 2-ը կենտ են , կարտածի 1 , հակառակ դեպքում՝ 2");
        int exc36[] = {a, b, c, d};
        int f = 0;
        for (int e = 0; e < exc36.length; e++) {
            b1 = (exc36[e] % 2 > 0);
            if (b1) {
                f++;
            }
        }
        if (f > 1)
            System.out.println(1);
        else System.out.println(2);

        a = 50;
        b = 66;
        c = 77;
        d = 89;

        System.out.println("7. կարտածեն true , եթե կազմում են թվաբանական պրոգրեսիա , այլապես՝ false");
        b1 = ((a - b) == (b - c) && (b - c) == (c - d));
        System.out.println(b1);

        a = 50;
        b = 66;
        c = 77;
        d = 89;
    }
}
