import java.util.Scanner;

public class LetterGame {
    public static void main(String... args) {

        int range = (int)(Math.random() *26) + 65;
        char randomChar = (char) (range);
        Scanner sc = new Scanner(System.in);
        char input;

        do {
            System.out.println("Please type any char");
            System.out.println("Correct letter - " + randomChar);
            input = sc.next().charAt(0);
            if ((int)input > 90) {
                input = (char)(input - 32);
            }
        } while   (input != randomChar );

        System.out.println("Correct!");
    }
}
