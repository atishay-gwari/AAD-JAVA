package com.company;

public class countnumberofchar {
    public static void main(String[] args) {
        String str = "The best of both worlds";
        int c=0;
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i)!=' ')
            {
                c++;
            }
        }
        System.out.println("The total number of character in the string "+c+".");
    }
}
