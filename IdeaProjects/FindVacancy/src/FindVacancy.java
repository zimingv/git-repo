import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class FindVacancy {
    public static void main(String[] args) throws IOException {
        int guests [] = new int[10];
        int roomNum;

        Scanner diskScanner = new Scanner(new File("GuestList.txt"));
        for (roomNum = 0; roomNum < 10; roomNum++) {
            guests[roomNum] = diskScanner.nextInt();
        }
        diskScanner.close();

        roomNum = 0;
        while (roomNum < 10 && guests[roomNum] != 0) {
            roomNum++;
        }

        if (roomNum == 10) {
            System.out.println("Извините, свободных комнат нет.");
        } else {
            System.out.println("Свободна комната № " + roomNum);
            System.out.print("Сколько человек поселяться в комнате ");
            System.out.println("? ");

            Scanner keyboard = new Scanner(System.in);
            guests[roomNum] = keyboard.nextInt();
            keyboard.close();

            PrintStream listOut = new PrintStream("GuestList.txt");
            for (roomNum = 0; roomNum < 10; roomNum++) {
                listOut.print(guests[roomNum]);
                listOut.print(" ");
            }
                    listOut.close();
        }
    }
}
