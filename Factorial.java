package com.company;
import java.util.*;
public class Factorial {
    public static void main(String[] args)
    {
       Scanner sc= new Scanner(System.in);
        System.out.print("Enter a value : ");
        int n=sc.nextInt();
        while(n>0)
        {
            if(n==(int)n)//checks if the number is a integers
            {
                int x=1;
                for(int i =1;i<=n;i++) {//the loop helps us in multiplying number i.e 1*2*3*4*5
                    x=x*(i);
                }
                System.out.println("THe factorial of "+n+" is "+x);

                break;//this stops it from becoming an infinite while loop
            }
            else
            {
                System.out.println("Try again");
                break;
            }
        }


        }
    }

