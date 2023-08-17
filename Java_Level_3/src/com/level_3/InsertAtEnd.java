package com.level_3;

import java.util.Arrays;

public class InsertAtEnd {

	 public static void main(String[] args) {
	        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};
	        int elementToInsert = 10;

	        int newSize = array.length + 1;
	        int[] newArray = Arrays.copyOf(array, newSize);

	        newArray[newSize - 1] = elementToInsert;

	        System.out.println("Original array: " + Arrays.toString(array));
	        System.out.println("Array after inserting " + elementToInsert + " at the end: " + Arrays.toString(newArray));
	    }
}
