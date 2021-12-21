package com.company;

public class copyyarray {
    public static void main(String[]args)
    {
       int a1[] =new int []{1,2,3,4,5};
       int a2[]=new int[a1.length];
       for(int i=0;i<a1.length;i++)
       {
           a2[i]=a1[i];
       }
        for(int i=0;i<a2.length;i++)//printing the copy aaray
        {
            System.out.print(a2[i]+" ");
        }
    }
}
