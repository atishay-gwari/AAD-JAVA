package com.company;

import java.util.Scanner;

public class Isbn {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        int x=n;
        int sum=0;
        for(int i =1;i<=10;i++)
        {
            int digit = x%10;
            sum= sum+ digit*i;
            x=x/10;
        }
     if(sum%11==0)
         System.out.println(n+" is an ISBN number");
     else
         System.out.println(n+" is not  an ISBN number");
    }

}
