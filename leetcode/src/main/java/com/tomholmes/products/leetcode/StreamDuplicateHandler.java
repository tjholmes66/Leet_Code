package com.tomholmes.products.leetcode;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDuplicateHandler {

    public static void main(String[] args) {
        // Initial list with duplicate entries
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
        System.out.println("Original List: " + items);

        // 1. REMOVE DUPLICATES (Get Unique Elements)
        List<String> uniqueItems = items.stream()
                .distinct()
                .toList();
        System.out.println("Unique Elements: " + uniqueItems);

        // 2. FIND DUPLICATES (Get Only the Elements That Appeared More Than Once)
        // Method A: Using a Set helper (Efficient O(N) approach)
        Set<String> seen = new HashSet<>();
        Set<String> duplicatesBySet = items.stream()
                .filter(item -> !seen.add(item)) // Set.add() returns false if the item already exists
                .collect(Collectors.toSet());
        System.out.println("Duplicate Elements (Set Filter): " + duplicatesBySet);

        // Method B: Using GroupBy & Frequency counting
        List<String> duplicatesByCount = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println("Duplicate Elements (Group Counting): " + duplicatesByCount);

        // 3. HANDLING AN ARRAY (Primitive or Object)
        int[] numbersArray = {1, 2, 2, 3, 4, 4, 4, 5};
        int[] uniqueNumbersArray = Arrays.stream(numbersArray)
                .distinct()
                .toArray();
        System.out.println("Unique Array: " + Arrays.toString(uniqueNumbersArray));
    }
}

