package com.level_3;

public class SeperateEvenOdd {

    public static void main(String[] args) {
        int[] array = {5, 8, 3, 9, 2, 7, 1, 6, 4};

        int evenCount = 0;
        int oddCount = 0;

        // Count the number of even and odd elements
        for (int num : array) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        int[] evenArray = new int[evenCount];
        int[] oddArray = new int[oddCount];

        int evenIndex = 0;
        int oddIndex = 0;

        // Separate even and odd elements into separate arrays
        for (int num : array) {
            if (num % 2 == 0) {
                evenArray[evenIndex] = num;
                evenIndex++;
            } else {
                oddArray[oddIndex] = num;
                oddIndex++;
            }
        }

        System.out.println("Even numbers:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nOdd numbers:");
        for (int num : oddArray) {
            System.out.print(num + " ");
        }
    }
}
