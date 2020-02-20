import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowGuest {
    public static void main(String[] args) throws IOException {
        int guest[] = new int[10];
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guest[roomNum] = diskScanner.nextInt();
        }

        System.out.println("Комната\tКоличество постояльцев");
        for (int roomNum = 0; roomNum < 10; roomNum++) {
            System.out.print(roomNum);
            System.out.print("    \t");
            System.out.println(guest[roomNum]);
        }
        diskScanner.close();
    }
}
