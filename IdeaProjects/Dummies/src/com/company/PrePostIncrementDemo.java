package com.company;

public class PrePostIncrementDemo {
    public static void main(String[] args) {
        int n = 27;
        ++n;
        System.out.println(n);
        System.out.println(++n);
        System.out.println(n);
        System.out.println(n++);
        System.out.println(n);

        System.out.println(--n);
        System.out.println(n);
        System.out.println(n--);
        System.out.println(n);
    }
}
