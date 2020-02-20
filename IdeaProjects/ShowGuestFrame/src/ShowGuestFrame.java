import com.allmycode.dummiesframe.DummiesFrame;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShowGuestFrame {

    public static void main(String[] args) {

        DummiesFrame frame = new DummiesFrame("Гостиница JAVA");
        frame.addRow("Введите номер комнаты ");
        frame.setButtonText("Количество жильцов в комнате");
        frame.go();

    }

    public static int calculate(int quantityTenant) throws IOException {
        int guest[] = new int[10];
        Scanner diskScanner = new Scanner(new File("GuestList.txt"));

        for (int roomNum = 0; roomNum < 10; roomNum++) {
            guest[roomNum] = diskScanner.nextInt();
        }
        diskScanner.close();

        return guest[quantityTenant];
    }
}

