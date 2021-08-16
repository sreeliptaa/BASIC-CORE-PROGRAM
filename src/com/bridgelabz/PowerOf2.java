package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N");
        int N = sc.nextInt();
        System.out.println("Powers of two N + " are: ");
        int powerOfTwo = 1;
        if (N > 0 && N < 31) {
            for (int i = 1; i <= N; i++) {
                powerOfTwo = 2 * powerOfTwo;
                System.out.println(powerOfTwo);
            }
        } else {
            System.out.println("INVALID ENTER");
        }
        sc.close();


    }
}
