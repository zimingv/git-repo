import java.text.NumberFormat;
import java.util.Scanner;

public class Room {
    private int guests;
    private double rate;
    boolean smoking;
    private static NumberFormat currency = NumberFormat.getCurrencyInstance();

    public void readRoom(Scanner diskScanner) {
        guests = diskScanner.nextInt();
        rate = diskScanner.nextDouble();
        smoking = diskScanner.nextBoolean();
    }

    public void writeRoom() {
        System.out.print("\t");
        System.out.print(guests);
        System.out.print("\t\t");
        System.out.print(currency.format(rate));
        System.out.print("\t\t");
        System.out.println(smoking ? "Да" : "Нет");
    }
}
