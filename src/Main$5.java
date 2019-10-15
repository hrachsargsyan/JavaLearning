public class Main$5 {


    public static void main(String[] args) {


        Queue$LinkedList cw = new Queue$LinkedList();

        for (int a = 1; a < 16; a++) {
            cw.push(a);
        }

        System.out.println("Get: " + cw.get(20));
        //      System.out.println(cw.pop());

        // System.out.println(cw.size);
    }
}
