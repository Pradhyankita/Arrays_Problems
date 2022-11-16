package com.bl.pp3;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] inputArray = {11, 2, 4, 11, 1, 4, 3, 3, 6};
        System.out.println("Duplicate Elements Found:");
        for (int i=0; i<inputArray.length; i++) {

            for (int j=i+1; j<inputArray.length; j++) {

                if (inputArray[i] == inputArray[j]) {

                    System.out.println(inputArray[i]);
                }
            }

        }
    }
}
