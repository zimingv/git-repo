import static java.lang.System.out;
import java.util.Scanner;
import java.util.Random;

class GuessingGame {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Bвeдитe число от 1 до 10: ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;
        if (inputNumber == randomNumber) {
            out.println("**********");
            out.println("*Bы выиграли.*");
            out.println("**********");
        } else {
            out.println("Bы проиграли.");
            out.print("Cлyчaйнoe число равно ");
            out.println(randomNumber + ".");
            out.println("Cпacибo за игру.");
        }
    }
}