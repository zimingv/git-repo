//// Демонстрация использования укороченных логических операций
//class SCops {
//    public static void main(String[] args) {
//        int n, d, q;
//        n = 10;
//        d = 2;
//        if (d ! = 0 && (n % d) == 0) //Укороченная операция предотвращает деленне на нуль
//        System.out.println(d + " является делителем " + n);
//        d = 0; // установить для d нулевое значение
//// Второй операнд не вычисляется, поскольку значение
//// переменной d равно нулю
//        if (d != 0 && (n % d) == 0)
//            System.out.println(d + " является делителем " + n);
///* А теперь те же самые действия выполняются без использования
//укороченного логического оператора. В результате возникнет
//ошибка "деление на нуль".
//*/
//        if (d != 0 & (n % d) == 0)
//        //Теперь вычисляются о6а выражения, в резуnьтате
//        //чего будет производиться деление на нуль
//        System.out.println(d + " является делителем " + n);
//    }
//}