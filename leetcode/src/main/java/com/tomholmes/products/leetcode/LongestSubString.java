package com.tomholmes.products.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LongestSubString {

    public String getUniqueCharacterSubstring(String input) {

        Map<Character, Integer> visited = new HashMap<>();

        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {

            char currChar = input.charAt(end);

            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar)+1, start);
            }

            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        System.out.println(input + " " + output);
        return output;
    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            char cur = s.charAt(right);

            // If a duplicate is found, shrink the window from the left
            while (set.contains(cur)) {
                char remove = s.charAt(left);
                set.remove(remove);
                left++;
            }

            // Add the current character and update maximum length
            set.add(cur);
            maxLength = Math.max(maxLength, right - left + 1);

        }
        System.out.println(s + " " + maxLength);
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubString longestSubString = new LongestSubString();
        System.out.println(longestSubString.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(longestSubString.lengthOfLongestSubstring("bbbb"));
        System.out.println(longestSubString.lengthOfLongestSubstring("pwwkew"));
        System.out.println(longestSubString.lengthOfLongestSubstring("a"));
        System.out.println(longestSubString.lengthOfLongestSubstring("abcdef"));
    }

}
