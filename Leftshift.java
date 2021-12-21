package com.company;

public class Leftshift {
    public static void main(String[]args) {

        int arr[] = new int[]{1, 2, 3, 4, 5};
        int n = 3;//number of time the array rotates
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int j = 0; j < n; j++) {//this loop is for shifting
            int temp = arr[0];int i;
            for ( i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];//changing values
            }
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    }

