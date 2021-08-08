package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();
        System.out.println("Powers of two till " + N + " are: ");
        int power_of_two = 1;
        if (N > 0 && N < 31) {
            for (int i = 1; i <= N; i++) {
                power_of_two = 2 * power_of_two;
                System.out.println(power_of_two);
            }
        } else {
            System.out.println("INVALID ENTER");
        }
        sc.close();


    }
}
