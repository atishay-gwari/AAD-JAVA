package com.company;
import java.util.*;
public class Palindrome {
 public static void main(String[] args)
 {
     Scanner sc=new Scanner(System.in);
//     System.out.print("Enter a word :");
//     String c=sc.nextLine();
//     int l= c.length();
//     String rev="";
//    for(int i=l-1;i>=0;i--)
//    {
//        rev=rev+c.charAt(i);
//    }
//    if(c.equals(rev))
//        System.out.println("this a plaidrome word");
//    else
//        System.out.println("this is not a plaindrome word");
     System.out.print("Enter a number :");
     int n=sc.nextInt();
     int z=n;
     int rev=0;
     while(n>0)
     {
         int digit=n%10;
         rev= (rev*10)+digit;
          n=n/10;
     }
    if(rev==z)
        System.out.println("this a plaidrome word");
    else
        System.out.println("this is not a plaindrome word");

 }
}

