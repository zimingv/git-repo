// Выполнение цикла до тех пор, пока с клавиатуры
// не будет введена буква S
class ForTest {
    public static void main(String args[])
            throws java.io.IOException {
        int i;
        System.out.println("Для остановки нажмите клавишу S");
        for (i = 0; (char) System.in.read() != 'S'; i+=5)
            System.out.println("Пpoxoд #" + i);
    }
}
