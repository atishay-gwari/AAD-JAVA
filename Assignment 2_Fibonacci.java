package com.company;

public class Fibonacci {
    public static void main(String[] args)
    {
        int x=0,y=1,z=0;
        System.out.print(x+","+y);//0 and 1 printed
        int c=10;
        for(int i=2;i<=c;++i)
        {
            z=x+y;
            System.out.print(","+z);
            x=y;
            y=z;

        }
//        Double s=new Double(213.658);
//        Long x=new Long(9787489);
//        System.out.println("Objects are not equal "+s.equals(x));
//        System.out.println("Objects are equal "+s.equals(213.658));//.equal is a method that help us in comparing the location two objects


    }
}
