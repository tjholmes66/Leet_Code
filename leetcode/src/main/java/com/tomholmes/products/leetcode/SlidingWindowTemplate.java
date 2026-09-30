package com.tomholmes.products.leetcode;

import java.util.*;

public class SlidingWindowTemplate {

    public int slidingWindowTemplate(String s) {
        // Can be an array (int[] nums)
        // 1. Initialize your data structure to track the window state
        // (Could be an int[] array for ASCII, a HashMap, a Counter sum, etc.)
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0; // Or Integer.MAX_VALUE if finding the minimum length

        // 2. Loop through the sequence with the 'right' pointer
        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);

            // 3. Expand the window: Add the current element to your window state
            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1);

            // 4. Shrink the window: While the current window violates the problem constraint
            // (e.g., duplicate found, map.size() > k, sum > target)
            while (windowIsInvalid(map)) {
                char leftChar = s.charAt(left);

                // Reduce the frequency/impact of the left element
                map.put(leftChar, map.get(leftChar) - 1);
                if (map.get(leftChar) == 0) {
                    map.remove(leftChar);
                }

                // Move the left pointer forward to shrink the window
                left++;
            }

            // 5. Update your result: The window is now guaranteed to be valid
            // For longest window:
            maxLength = Math.max(maxLength, right - left + 1);

            // (Alternative) For shortest window (you would move this inside the while loop):
            // minLength = Math.min(minLength, right - left + 1);
        }

        return maxLength;
    }

    // Helper placeholder representing your specific LeetCode condition
    private boolean windowIsInvalid(Map<Character, Integer> map) {
        // e.g., for LC 3 (Longest Substring Without Repeating Characters):
        // Return true if any value in the map is > 1
        return false;
    }
}

