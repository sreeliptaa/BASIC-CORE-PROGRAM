package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        double result = 0;
        double num = 0;
        double j = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Nth value to find harmonic value: ");
        int n = sc.nextInt();
        for (j = 1; j <= n; j++) {
            num = num + (1 / j);
            result = num;
        }
        System.out.println("The value of harmonic no. " + n + " is: " + result);
        sc.close();
    }
}
