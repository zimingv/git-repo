public class Test {
    public static void main(String[] args) {
        int x=1;
        Integer x2 = 123; // автоупаковка в обертку, равнозначно тому, что ниже
        Integer x3 = new Integer(123);
        int y = x2; //автораспаковка
        Integer.parseInt("123");
    }
}
