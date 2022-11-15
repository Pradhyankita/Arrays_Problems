package com.bl.pp3;

import java.util.Scanner;

public class DisplayElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");

        int size = sc.nextInt();
        int[] myArr = new int[size];

        System.out.println("Enter " + myArr.length + " values");
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = sc.nextInt();
        }
        System.out.println("Array:- ");
        int i;
        for (i = 0; i < myArr.length; i++) {
            System.out.println(myArr[i]);
        }
    }
}