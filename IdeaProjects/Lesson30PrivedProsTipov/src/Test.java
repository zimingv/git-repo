public class Test {
    public static void main(String[] args) {
        float f = (float) 123.6;

        int a = 123;
        long l = a;       //неявное приведение типов
        int x = (int) l;  //явное приведение типов
        System.out.println(x);

        double b = a;
        System.out.println(b);

        double p = 123.7;
        long m = Math.round(p);
        System.out.println(m);

        byte g = (byte)128; // - 128 to 127
        System.out.println(g);
    }

}

