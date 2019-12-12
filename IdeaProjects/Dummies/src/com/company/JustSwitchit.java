import java.util.Scanner;

class JustSwitchit {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Пoчeмy Эл стоит под дождем? Введите номер: ");
        int verse = keyboard.nextInt();
        switch (verse) {
            case 1:
                System.out.println("Пoтoмy что дождь идет очень долго.");
                break;
            case 2:
                System.out.println("Пoтoмy что он очень расстроен.");
                break;
            case 3:
                System.out.println("Пoтoмy что он все равно уже мокрый.");
                break;
            default:
                System.out.println("Taкoй причины нет. Попытайтесь еще раз.");
                break;
        }
        System.out.println("O-OOOOOO ... ");
    }
}