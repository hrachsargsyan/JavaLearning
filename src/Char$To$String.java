import java.util.Arrays;

public class Char$To$String {
    public static void main(String[] args) {
        System.out.println("Write a Java program to count the letters, spaces, numbers and other characters of an input stringThe string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33 +  \n");

        String text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] ch = text.toCharArray();

        int count = 0;
        int digit = 0;
        int letter = 0;
        int space = 0;
        int other = 0;

        while (count < ch.length) {
            if (Character.isDigit(ch[count]))
                digit++;
            else if (Character.isAlphabetic(ch[count]))
                letter++;
            else if (Character.isSpaceChar(ch[count]))
                space++;
            else other++;

            count++;

        }
        System.out.println(Arrays.toString(ch));
        System.out.println("letter:" + letter + "\n" + "other:" + other + "\n" + "digit:" + digit + "\n" + "space:" + space);

    }
}

