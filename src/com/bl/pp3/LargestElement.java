package com.bl.pp3;

public class LargestElement {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] myArray = {23, 92, 56, 39, 93};
        LargestElement m = new LargestElement();
        System.out.println("Maximum value in the array is::"+m.max(myArray));
    }
}
