import java.util.Scanner;

public class MassMoon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float m, mn;
        System.out.print("Введите ваш вес = ");
        m = scan.nextFloat();
        mn = m*17/100;
        System.out.println("Ваш вес на Луне = " + mn+"кг");
    }
}
