package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args){
        System.out.println("Enter a Number");
        Scanner scanner = new Scanner(System.in);
        int number= scanner.nextInt();
        scanner.close();
    
        if (number % 2 == 0) {
            System.out.println("The Given No Is Even Number");
        }
        else
        {
            System.out.println("The Given No Is Odd Number");
        }
    }
    
}
