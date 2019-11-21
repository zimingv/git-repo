// Объявление переменной цикла в самом цикле for
class ForVar {
    public static void main(String args[]) {
        int sum = 0;
        int fact = 1;
// Вычисление факториала чисел от 1 до 5
        for (int i = 1; i <= 5; i++) { //Переменная i Объявляется в самом операторе for
            sum += i; // переменная i доступна во всем цикле
            fact *= i;
// однако здесь переменная i недоступна
            System.out.println("Cyммa: " + sum);
            System.out.println("Фaктopиaл: " + fact);
        }
    }
}
