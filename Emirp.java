package com.company;

import java.util.Scanner;

public class Emirp {
    public static boolean Prime(int n)//to check if the number is prime or not . returns a boolean value
    {
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }

        }
        return true;
    }
    public static int reverse(int n)//to reverse the number which is prime. returns an integer value
    {
        int z=n;
        int rev=0;
        while(n>0)
        {
            int digit=n%10;
            rev= (rev*10)+digit;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n= sc.nextInt();
        if(Prime(n))
        {
            System.out.println(n+" is a prime number.");
            int z=reverse(n);
            if(Prime(z))
                System.out.println(n+" is a Emirp number.");
            else
                System.out.println(n+" is not a Emirp number.");
        }
        else
            System.out.println(n+" is not a prime number.");

    }

}
