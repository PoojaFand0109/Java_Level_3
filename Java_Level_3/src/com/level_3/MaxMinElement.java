package com.level_3;

public class MaxMinElement {

	  public static void main(String[] args) {
	        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};

	        int max = array[0];
	        int min = array[0];

	        for (int num : array) {
	            if (num > max) {
	                max = num;
	            }
	            if (num < min) {
	                min = num;
	            }
	        }

	        System.out.println("Maximum element: " + max);
	        System.out.println("Minimum element: " + min);
	    }
}
