package com.company;

import java.util.Scanner;

public class NeonNumber {
    public static void main(String[] args)
    {
        int y =0;
        Scanner m= new Scanner(System.in);
        System.out.print("Enter the number :");//asks the user to enter an integer value
        int n=m.nextInt();
        int x=n*n;
        while(x != 0) {
            int digit = x % 10; //divides the number in digits
            x= x/10;
            y = y + digit;// Adds the digits

        }
        if(n==y) //checks if the sum of the digit matches to the original number
            System.out.println(n+" is a neon number");
        else
            System.out.println(n+" is not a neon number");



    }
}
