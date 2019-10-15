import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        String text = "Formatted text has its genesis in the pre-computer use of underscoring to embolden passages in typewritten manuscripts. In the first interactive systems of early computer technology, underscoring was not possible, and users made up for this lack (and the lack of formatting in ASCII) by using certain symbols as substitutes. Emphasis, for example, could be achieved in ASCII in a number of ways:";
        char[] textArray = text.toCharArray();
        int digit = 0;
        int space = 0;
        int letter = 0;
        ArrayList<Character> otherMass = new ArrayList<>();
        int other = 0;
        int a = 0;

        System.out.println(text);
        while (a < textArray.length) {

            if (Character.isDigit(textArray[a]))
                digit++;
            else if (Character.isSpaceChar(textArray[a]))
                space++;
            else if (Character.isAlphabetic(textArray[a]))

                letter++;
            else {
                other++;
                otherMass.add(textArray[a]);
            }
            a++;
        }
        System.out.println("Digit: " + digit + "\nSpace: " + space + "\nLetter: " + letter + "\nOther: " + other);
        System.out.println(otherMass);
    }
}
