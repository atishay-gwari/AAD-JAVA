package com.company;

import java.util.Scanner;

public class Bouncy {
    public static boolean Inc(int n)
    {
        boolean c=true;
        String s= Integer.toString(n);
        for (int i=0;i<s.length()-1;i++)
        {
            char digit= s.charAt(i);
            if(digit>s.charAt(i+1))
            {

                c=false;
                break;
            }
        }
        return c;
    }
    public static boolean Dec(int n)
    {
        boolean c=true;
        String s= Integer.toString(n);
        for (int i=0;i<s.length()-1;i++)
        {
            char digit= s.charAt(i);
            if(digit<s.charAt(i+1))
            {

                c=false;
                break;
            }
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number :");
        int n=sc.nextInt();
        if(Inc(n)||Dec(n)||n<101)
        {
            System.out.println(n+" is not a Bouncy number");
        }
        else
            System.out.println(n+" is a Bouncy number");
    }
}
