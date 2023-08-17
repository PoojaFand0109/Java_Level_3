package com.level_3;

public class AverageOfArrayElements {
	
	  public static void main(String[] args) {
	        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};

	        int sum = 0;

	        for (int num : array) {
	            sum += num;
	        }

	        double average = (double) sum / array.length;

	        System.out.println("Average of elements: " + average);
	    }

}
