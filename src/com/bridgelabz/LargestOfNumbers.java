package com.bridgelabz;
import java.util.Scanner;
public class LargestOfNumbers {
    static void largestNumber(int num1,int num2,int num3){
        System.out.println("Largest Number of Three No: ");
        if(num1>num2 && num1>num3)
            System.out.println(num1);
        if(num2>num1 && num2>num3)
            System.out.println(num2);
        if(num3>num1 && num3>num2)
            System.out.println(num3);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number1:");
        int num1=sc.nextInt();
        System.out.println("Enter Number2:");
        int num2= sc.nextInt();
        System.out.println("Enter Number3:");
        int num3= sc.nextInt();
        largestNumber(num1,num2,num3);
    }
}
