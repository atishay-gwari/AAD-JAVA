package com.company;
import java.util.*;

public class Technumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a EVEN digit number :");
        int n = sc.nextInt();
        int temp = n;
        int l = Integer.toString(temp).length();
        while (n > 0) {

            if (l % 2 == 0) {
                int z = n;
                int x = z % (int) Math.pow(10, l / 2);
                int y = z / (int) Math.pow(10, l / 2);
                int sum = (int) Math.pow((x + y), 2);
                if (z == sum) {
                    System.out.println(z + " is a tech number");
                    break;
                } else {
                    System.out.println(z + " is not a tech number");
                    break;
                }
            } else {
                System.out.println("Try entering an even number");
                break;
            }
        }
    }
}
