package com.level_3;

public class SecondLargestElement {

	   public static void main(String[] args) {
	        int[] arr = {10, 5, 20, 15, 8};
	        int secondLargest = findSecondLargest(arr);
	        System.out.println("The second largest element is: " + secondLargest);
	    }

	    public static int findSecondLargest(int[] arr) {
	        int firstLargest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : arr) {
	            if (num > firstLargest) {
	                secondLargest = firstLargest;
	                firstLargest = num;
	            } else if (num > secondLargest && num != firstLargest) {
	                secondLargest = num;
	            }
	        }

	        return secondLargest;
	    }
}
