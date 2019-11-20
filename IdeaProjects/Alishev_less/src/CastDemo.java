// Демонстрация приведения типов
public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.1;
        y = 3.2;
        i = (int) (x / y); // привести тип double к типу int
        System.out.println("Целочисленный результат деления x/y: " + i);

        i = 100;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i;
        System.out.println("Значение b: " + b);

        b = 88; // Представление символа Х в коде ASCII
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}
