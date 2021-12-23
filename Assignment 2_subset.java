package com.company;
import java.util.*;
public class subset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the word :");
        String str=sc.nextLine();
        int l=str.length();
        int temp=0;
        String arr[]=new String[l*(l+1)/2];
        for(int i=0;i<l;i++)
        {
            for(int j=i;j<l;j++)
            {
                arr[temp]=str.substring(i,j+1);
                temp++;
            }

        }
        System.out.println("The subset of the word are ");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}
