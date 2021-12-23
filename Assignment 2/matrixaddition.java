package com.company;

public class matrixaddition {
    public static void main(String[]args)
    {
        int ar[][]=new int [3][3];//2d matrix initialized
        int a[][]={{1,3,4},{2,4,3},{3,4,5}};
        int b[][]={{1,2,3},{2,6,1},{3,7,9}};

        for (int i=0;i<3;i++)//this loop is for adding the two matrices.
        {
            for (int j=0;j<3;j++)
            {
                ar[i][j]=a[i][j]+b[i][j];//adding the values of the matrix
                System.out.print(ar[i][j]+" ");//printing the matrix

            }
            System.out.println();
        }

//        for (int i=0;i<3;i++)// this loop is for multiplying the matrices.
//        {
//            for (int j=0;j<3;j++)
//            {
//                ar[i][j]=0;
//                for(int k=0;k<3;k++)
//                {
//                    ar[i][j]+=a[i][k]*b[k][j];
//                }
//                System.out.print(ar[i][j]+" ");//printing the matrix
////                ar[i][j]=a[i][j]+b[i][j];//adding the values of the matrix
////                System.out.print(ar[i][j]+" ");//printing the matrix
//
//            }
//            System.out.println();
//        }
    }
}
