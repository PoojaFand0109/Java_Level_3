package com.level_3;

public class DeleteElementFromArray {
	   public static void main(String[] args) {
	        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};
	        int target = 2; // Replace with the integer you want to delete

	        int newSize = array.length - 1;
	        int[] newArray = new int[newSize];

	        int newIndex = 0;

	        for (int num : array) {
	            if (num != target) {
	                newArray[newIndex] = num;
	                newIndex++;
	            }
	        }

	        System.out.println("Original array:");
	        for (int num : array) {
	            System.out.print(num + " ");
	        }

	        System.out.println("\nArray after deleting " + target + ":");
	        for (int num : newArray) {
	            System.out.print(num + " ");
	        }
	    }

}
