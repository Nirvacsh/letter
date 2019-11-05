import java.util.Scanner;

public class LetterGame {
    public static void main(String... args) {

        final int numberOfChars = 32;

        int range = (int)(Math.random() *26) + 65;
        char randomChar = (char) (range);
        Scanner sc = new Scanner(System.in);
        char input;

        do {
          //System.out.println("Correct letter - " + randomChar);
            input = sc.next().charAt(0);
            if (!Character.UnicodeBlock.CYRILLIC.equals(Character.UnicodeBlock.of(input))) {

                if ((input - numberOfChars) < randomChar) {
                    System.out.println("too low");
                } else if ((input - numberOfChars) > randomChar) {
                    System.out.println("too high");
                }
                if ((int) input > 90) {
                    input = (char) (input - numberOfChars);
                }
            } else {
                System.out.println("Using cyrillic!!!");
            }
        } while (input != randomChar );

        System.out.println("Correct!");
    }
}
