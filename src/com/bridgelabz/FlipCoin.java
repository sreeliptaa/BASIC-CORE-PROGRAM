package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int headCount = 0;
        int tailCount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times the coin is tossed");
        int coin_tossed = sc.nextInt();
        for (int j = 0; j < coin_tossed; j++) {
            double flipCoin = Math.random();
            if (flipCoin < 0.5)
                tailCount++;
            else
                headCount++;
        }
        double heads = headCount * 100 / coin_tossed;
        double tails = tailCount * 100 / coin_tossed;
        System.out.println("Percentage of heads: " + heads + " % ");
        System.out.println("Percentage of tails: " + tails + " % ");
        sc.close();
    }
}
