package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner num = new Scanner(System.in);
        int first, second, result;
        System.out.print("Enter first num: ");
        first = num.nextInt();
        System.out.print("Enter second num: ");
        second = num.nextInt();
        result = first + second;
        result /= 2;
        System.out.println("Result is - " + result);
    }
}
