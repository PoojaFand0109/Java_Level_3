package com.level_3;

import java.util.HashMap;
import java.util.Map;

public class ElementOccurrence {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 1, 3, 5, 6, 5, 7, 8, 7};

        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int num : array) {
            occurrences.put(num, occurrences.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element Occurrences:");
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
