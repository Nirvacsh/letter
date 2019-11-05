import java.util.Scanner;

public class LetterGame {
    public static void main(String... args) {

        int range = (int)(Math.random() *26) + 65;
        char randomChar = (char) (range);
        Scanner sc = new Scanner(System.in);
        char input;

        do {
          //System.out.println("Correct letter - " + randomChar);
            input = sc.next().charAt(0);
            if (!Character.UnicodeBlock.CYRILLIC.equals(Character.UnicodeBlock.of(input))) {

                if ((input - 32) < randomChar) {
                    System.out.println("too low");
                } else if ((input - 32) > randomChar) {
                    System.out.println("too high");
                }
                if ((int) input > 90) {
                    input = (char) (input - 32);
                }
            } else {
                System.out.println("Using cyrillic!!!");
            }
        } while (input != randomChar );

        System.out.println("Correct!");
    }
}
