public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i<=15; i++) {
            if (i%2==0)
            {
                System.out.println("Это четное число " + i);
                continue;
            }
            System.out.println("Это нечетное число " + i);
        }
    }
}
