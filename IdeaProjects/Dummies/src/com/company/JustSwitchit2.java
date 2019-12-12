import java.util.Scanner;

class JustSwitchit2 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Пoчeмy Эл стоит под дождем? Введите номер: ");
        String verse = keyboard.next();
        switch (verse) {
            case "one":
                System.out.println("Пoтoмy что дождь идет очень долго.");
                break;
            case "two":
                System.out.println("Пoтoмy что он очень расстроен.");
                break;
            case "three":
                System.out.println("Пoтoмy что он все равно уже мокрый.");
                break;
            default:
                System.out.println("Taкoй причины нет. Попытайтесь еще раз.");
                break;
        }
        System.out.println("O-OOOOOO ... ");
    }
}