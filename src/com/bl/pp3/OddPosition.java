package com.bl.pp3;

public class OddPosition {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.println("Elements of array present on odd position are:");

        for (int i = 0; i < arr.length; i = i + 2) {
            System.out.println(arr[i]);
        }
    }
}
