package com.company;

public class printinhupperhalfofarray {
    public static void main(String[] args) {

        int a[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int r = a.length;
        int c = a[0].length;
        if (r != c) {
            System.out.println("make a Square matrix");
        }
        else
        {
            for (int i = 0; i < 3; i++)//this loop is for adding the two matrices.
            {
                for (int j = 0; j < 3; j++) {
                    if(i>j)// to print only the upper half of matrix.
                        // IF U CHANGE THE SIGN U WILL PRINT THE OTHER LOWER PART OF THE MATRIX.
                        System.out.print("0 ");
                    else
                    System.out.print(a[i][j] + " ");//printing the matrix

                }
                System.out.println();
            }
        }
    }
}
