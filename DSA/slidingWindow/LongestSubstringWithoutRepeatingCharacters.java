
/*
Question: Longest Substring Without Repeating Characters

Given a string s, find the length of the longest substring
without repeating characters.

A substring is a contiguous sequence of characters.

Examples:

Input: s = "abcabcbb"
Output: 3
Explanation:
The longest substring is "abc".

Input: s = "bbbbb"
Output: 1
Explanation:
The longest substring is "b".

Input: s = "pwwkew"
Output: 3
Explanation:
The longest substring is "wke".

Constraints:
0 <= s.length <= 50000
s consists of English letters, digits, symbols and spaces.
*/

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {

        // Your code here

        return 0;
    }

    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("abcabcbb")); // Expected: 3
        System.out.println(lengthOfLongestSubstring("bbbbb"));    // Expected: 1
        System.out.println(lengthOfLongestSubstring("pwwkew"));   // Expected: 3
        System.out.println(lengthOfLongestSubstring(""));         // Expected: 0
        System.out.println(lengthOfLongestSubstring("dvdf"));     // Expected: 3
    }
}