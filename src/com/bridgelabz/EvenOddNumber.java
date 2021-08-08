package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNumber {
    static void printResult(int number){
        if(number%2==0){
            System.out.println("The Given No Is Even Number");
        }else{
            System.out.println("The Given No Is Odd Number");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter a Number");
        Scanner sc =new Scanner(System.in);
        int number= sc.nextInt();
        printResult(number);
    }
}
