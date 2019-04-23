public class Lesson23String {
    public static void main(String[] args) {
//        String x = "hello";
//        x = x.toUpperCase();
//        System.out.println(x);
//        String string1 = "Hello ";
//        String string2 = "my ";
//        String string3 = "friend";
//        String stringAll = string1+string2+string3;
//        System.out.println(stringAll);
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.append(" my").append(" friend");
        System.out.println(sb.toString());
        System.out.printf("This is a string, %s", "NICE"); //%s вставляем в это место строку после запятой
        System.out.printf("This is a \n string, %d", 18); //%d вставляем цифру // \n перенос строки
        System.out.printf("This is a string, %-10d", 532); //%10d вставляем перед цифрой 10 симвовлов
        System.out.printf("This is a string, %.2f", 532.32432423423); //%.2f приводим количество симвовлов после запятой к одному виду
        System.out.printf("This is a string, %.2f", 532.3243);
    }
}
