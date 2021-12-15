package com.company;
import java.util.*;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number :");//ask the user to input an integer value
        int n=sc.nextInt();
        int x=n;
        int sum=0;
        while(x!=0)
        {
            int digit= x%10;//divides the number in digits
            x=x/10;
            sum = sum +digit*digit*digit;// Adds the digits
        }
        if (n==sum)//checks if the calculated sum is equal to the original number
                    System.out.println(n+" is an armstrong number");
        else
                    System.out.println(n+" is not an armstrong number");
    }
}
