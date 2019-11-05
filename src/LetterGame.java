import java.util.Scanner;

public class LetterGame {
    public static void main(String... args) {

        final int NUMBER_OF_CHARS = 32;

        int range = (int)(Math.random() *26) + 65;
        char randomChar = (char) (range);
        Scanner sc = new Scanner(System.in);
        char input;

        do {
          //System.out.println("Correct letter - " + randomChar);
            input = sc.next().charAt(0);
            if (!Character.UnicodeBlock.CYRILLIC.equals(Character.UnicodeBlock.of(input))) {

                if ((input - NUMBER_OF_CHARS) < randomChar) {
                    System.out.println("too low");
                } else if ((input - NUMBER_OF_CHARS) > randomChar) {
                    System.out.println("too high");
                }
                if ( input > 'Z') {
                    input = (char) (input - NUMBER_OF_CHARS);
                }
            } else {
                System.out.println("Using cyrillic!!!");
                System.out.println("Input one more time");
            }
        } while (input != randomChar );

        System.out.println("Correct!");
    }
}
