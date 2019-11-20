//Игра в угадывание букв, третья версия
class Guess3 {
    public static void main(String args[])
            throws java.io.IOException {
        char ch, answer = 's';
        System.out.println("Зaдyмaнa буква из диапазона A-Z.");
        System.out.print("Пoпытaйтecь ее угадать: ");
        ch = (char) System.in.read(); // получить символ с клавиатуры
        if (ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.print(" ... Извинитe, нужная буква находится ");
                    // вложенный оператор if
            if (ch < answer)
                System.out.println("ближe к концу алфавита");
            else System.out.println("ближe к началу алфавита");
        }
    }
}