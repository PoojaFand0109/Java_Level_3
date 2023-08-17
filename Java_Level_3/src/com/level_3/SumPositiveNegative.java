package com.level_3;

public class SumPositiveNegative {
	
	   public static void main(String[] args) {
	        int[] array = {-5, 8, -3, 9, -2, 7, -1, 6, -4};

	        int sumPositive = 0;
	        int sumNegative = 0;

	        for (int num : array) {
	            if (num > 0) {
	                sumPositive += num;
	            } else if (num < 0) {
	                sumNegative += num;
	            }
	        }

	        System.out.println("Sum of positive elements: " + sumPositive);
	        System.out.println("Sum of negative elements: " + sumNegative);
	    }

}
