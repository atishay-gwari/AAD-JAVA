package com.company;

public class Small {
    public static void main(String[] args)
    {
        int ar[]=new int[]{25,12,56,8,98,2};
        int min=ar[0];
        for(int i=0;i<ar.length;i++)
        {
            if(ar[i]<min)
            {
                min=ar[i];//compares the array element to the min value
            }
        }
        System.out.println("The minnimum number in the array is "+min);
    }
}
