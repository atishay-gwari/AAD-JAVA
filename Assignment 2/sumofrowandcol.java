package com.company;

public class sumofrowandcol {
    public static void main(String[] args)
    {
        int a[][] = {
                {5, 9, 8},
                {1, 2, 9},
                {3, 2, 4}
        };

        //Calculates number of rows and columns present in given matrix
        int r = a.length;
        int c = a[0].length;
        int s,sc;
        //Calculates sum of each row of given matrix
        for(int i = 0; i < r; i++){
            s = 0;
            for(int j = 0; j < c; j++){
                s = s + a[i][j];
            }
            System.out.println("Sum of " + (i+1) +" row: " + s);
        }

        //Calculates sum of each column of given matrix
        for(int i = 0; i < c; i++){
            sc = 0;
            for(int j = 0; j < r; j++){
                sc = sc+ a[j][i];
            }
            System.out.println("Sum of " + (i+1) +" column: " + sc);
        }
    }
}
    
