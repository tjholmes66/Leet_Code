package com.tomholmes.products.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestSubStringTest {

    LongestSubString method = new LongestSubString();

    @Test
    public void testLengthOfLongestSubstring() {
        int result = method.lengthOfLongestSubstring("abcabcbb");
        assertEquals(3, result);
        result = method.lengthOfLongestSubstring("bbbb");
        assertEquals(1  , result);
        result = method.lengthOfLongestSubstring("pwwkew");
        assertEquals(3, result);
        result = method.lengthOfLongestSubstring("abcdef");
        assertEquals(6, result);
    }

    @Test
    public void testGetUniqueCharacterSubstring() {
        String result = method.getUniqueCharacterSubstring("abcabcbb");
        assertEquals("abc", result);
        result = method.getUniqueCharacterSubstring("bbbb");
        assertEquals("b"  , result);
        result = method.getUniqueCharacterSubstring("pwwkew");
        assertEquals("wke", result);
        result = method.getUniqueCharacterSubstring("abcdef");
        assertEquals("abcdef", result);
    }



}
