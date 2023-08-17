package com.level_3;

import java.util.Arrays;

public class ReverseArray {
	   public static void main(String[] args) {
	        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};

	        int length = array.length;
	        int[] reversedArray = new int[length];

	        for (int i = 0; i < length; i++) {
	            reversedArray[length - i - 1] = array[i];
	        }

	        System.out.println("Original array: " + Arrays.toString(array));
	        System.out.println("Reversed array: " + Arrays.toString(reversedArray));
	    }

}
