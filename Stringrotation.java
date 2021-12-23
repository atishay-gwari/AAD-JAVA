package com.company;

public class Stringrotation {
    public static void main(String[] args) {
        String str1 = "abcde", str2 = "deabc";
        if (str1.length()!=str2.length())
        {
            System.out.println("Second string not in rotation of string one.");
        }
        else
        {
            str1=str1.concat(str1);
            if (str1.indexOf(str2)!=-1)
                System.out.println("The second string is in rotation of string one");
            else
                System.out.println("The second string is not in rotation of string one");
        }
    }
}
