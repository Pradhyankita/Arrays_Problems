package com.bl.pp3;

public class SmallestElement {
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] myArray = {23, 92, 56, 39, 93};
        SmallestElement m = new SmallestElement();
        System.out.println("Minimum value in the array is::"+m.min(myArray));
    }
}
