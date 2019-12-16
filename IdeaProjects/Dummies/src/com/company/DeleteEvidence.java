import java.io.File;
import java.util.Scanner;

class DeleteEvidence {
    public static void main(String args[]) {
        File evidence = new File("cookedBooks.txt");
        Scanner keyboard = new Scanner(System.in);
        char reply;
        do {
            System.out.print("Yдaлить файл? (y/n) ");
            reply = keyboard.findWithinHorizon(".", 0).charAt(0);
        } while (reply != 'y' && reply != 'Y' &&
                reply != 'n' && reply != 'N');
        if (reply == 'y' || reply == 'Y'){
            System.out.println("Лaднo, удаляю.");
            evidence.delete();
            System.out.println("Фaйл удален.");
        } else {
            System.out.println("Лaднo, не удаляю.");
        }
    }
}
