package org.example.MaxLength;

//You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.
//
//Return the maximum possible length of s.
//
//A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxLength {
    public int maxLength(List<String> arr) {
        return backtrack(arr, "", 0);
    }

    private int backtrack(List<String> arr, String current, int index) {
        // Check if the current string has unique characters
        if (!hasUniqueCharacters(current)) {
            return 0;
        }

        int maxLength = current.length();

        // Try appending each remaining string in the array to the current string
        for (int i = index; i < arr.size(); i++) {
            maxLength = Math.max(maxLength, backtrack(arr, current + arr.get(i), i + 1));
        }

        return maxLength;
    }

    private boolean hasUniqueCharacters(String s) {
        boolean[] seen = new boolean[26]; // Assuming only lowercase English letters

        for (char c : s.toCharArray()) {
            if (seen[c - 'a']) {
                return false; // Duplicate character found
            }
            seen[c - 'a'] = true;
        }

        return true;
    }

    public static void main(String[] args) {
        MaxLength maxLengthOfString = new MaxLength();

        // Example 1
        List<String> arr1 = List.of("un", "iq", "ue");
        int result1 = maxLengthOfString.maxLength(arr1);
        System.out.println("Example 1: " + result1);

        // Example 2
        List<String> arr2 = List.of("cha", "r", "act", "ers");
        int result2 = maxLengthOfString.maxLength(arr2);
        System.out.println("Example 2: " + result2);
    }
}
