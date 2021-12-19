package com.company;
import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int x=n;
        int digit;
        int sum = 0;
        int c ;
        while(x>0)
        {
            digit = x % 10;
            x/=10;
            String z=Integer.toString(n);
            c=z.length();
            sum += Math.pow(digit, c);
        }
        if(sum == n)
            System.out.println(n + " is an armstrong number");
        else
            System.out.println(n + " is not an armstrong number");
    }
}
