package com.level_3;

import java.util.Arrays;

public class InsertAtStart {

    public static void main(String[] args) {
        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};
        int elementToInsert = 10;

        int newSize = array.length + 1;
        int[] newArray = new int[newSize];

        newArray[0] = elementToInsert;

        for (int i = 0; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array after inserting " + elementToInsert + " at the start: " + Arrays.toString(newArray));
    }
}
