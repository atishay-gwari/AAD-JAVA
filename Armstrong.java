package com.company;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int x;
        int digit;
        int sum = 0;
        int c = 0;
        x= n;
        for (;x != 0; x/= 10)
        {
            c++;
        }
        x=n;
        for (;x!= 0; x /= 10)
        {
            digit = x % 10;
            sum += Math.pow(digit, c);
        }
        if(sum == n)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
}
