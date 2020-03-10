public class DArray {
    public static void main(String[] args) {
        double Dar [] = {2.20, 3.80, 4.20, 5.80, 6.1};

        double total = 0;
        for (double value : Dar) {
            total = total + value;
        }

        System.out.println(total / Dar.length);
    }
}
