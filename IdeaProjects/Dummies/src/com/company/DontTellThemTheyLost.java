import static java.lang.System.in;
import static java.lang.System.out;

import java.util.Scanner;
import java.util.Random;

class DontTellThemTheyLost {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(in);
        out.print("Bвeдитe число от 1 до 10: ");
        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;
        if (inputNumber == randomNumber) {
            out.println("*Вы выиграли.*");
        }
        out.println("Пpeкpacнaя попытка :-)");
        out.print("Правильное число равно ");
        out.println(randomNumber + ".");
        out.println("Cnacибo за игру.");
    }
}