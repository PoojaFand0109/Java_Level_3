package com.level_3;

import java.util.Arrays;

public class InsertAtMiddle {
    public static void main(String[] args) {
        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};
        int elementToInsert = 10;

        int indexToInsert = array.length / 2; // Find the middle index

        int newSize = array.length + 1;
        int[] newArray = new int[newSize];

        // Copy the elements before the middle index
        System.arraycopy(array, 0, newArray, 0, indexToInsert);

        // Insert the element at the middle index
        newArray[indexToInsert] = elementToInsert;

        // Copy the remaining elements after the middle index
        System.arraycopy(array, indexToInsert, newArray, indexToInsert + 1, array.length - indexToInsert);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after inserting " + elementToInsert + " at the middle: " + Arrays.toString(newArray));
    }

}
